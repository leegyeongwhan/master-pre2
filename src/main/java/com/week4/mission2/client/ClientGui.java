package com.week4.mission2.client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ClientGui extends JFrame implements ActionListener, Runnable {

    private Container container = getContentPane();
    private JTextArea textArea = new JTextArea();
    private JScrollPane scrollPane = new JScrollPane(textArea);
    private JTextField textField = new JTextField();

    private Socket socket;
    private PrintWriter pw;
    private BufferedReader br;
    private String str;        // 채팅 문자열 저장

    public ClientGui(String ip, int port) {

        setTitle("채팅 프로그램");
        setSize(400, 400);
        setLocation(400, 400);
        init();
        start();
        setVisible(true);
        initNet(ip, port);
    }

    //포트와, ip를 체크 후  접속체크
    private void initNet(String ip, int port) {
        try {
            this.socket = new Socket(ip, port);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // ture : auto flush 설정
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        } catch (UnknownHostException e) {
            System.out.println("IP 주소가 다릅니다.");
        } catch (IOException e) {
            System.out.println("접속 실패");
        }

        Thread thread = new Thread(this);
        thread.start();
    }

    private void init() {
        container.setLayout(new BorderLayout());
        container.add("Center", scrollPane);
        container.add("South", textField);
    }

    private void start() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        textField.addActionListener(this);
    }

    // 응답 대기
    @Override
    public void run() {
        while (true) {
            try {
                str = br.readLine();
                textArea.append(str + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        str = textField.getText();
        pw.println(str);
        textField.setText("");
    }
}