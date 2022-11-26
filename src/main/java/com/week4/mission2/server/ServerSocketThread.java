package com.week4.mission2.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class ServerSocketThread extends Thread {
    private Socket socket;
    private ChatServer server;
    private BufferedReader br;        // 입력 담당 클래스
    private PrintWriter pw;        // 출력 담당 클래스
    private String name;

    public ServerSocketThread(ChatServer server, Socket socket) {
        this.server = server;
        this.socket = socket;
       // System.out.println(socket.getInetAddress() + "님이 입장하였습니다.");    // IP주소 얻어옴
    }

    public void sendMessage(String str) {
        pw.println(str);
    }

    // 쓰레드
    @Override
    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // true : autoFlush 설정
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

            sendMessage("대화자 이름을 넣으세요");
            name = br.readLine();
            server.broadCasting("[" + name + "]님이 입장하셨습니다.");

            while (true) {
                String str_in = br.readLine();
                server.broadCasting("[" + name + "] " + str_in);
            }
        } catch (IOException e) {
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}