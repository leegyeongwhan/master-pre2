package com.week4.mission2.client;


import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class ChatClient extends Frame implements ActionListener {

    private String nickname = null; //닉네임
    private boolean flag = false;
    private TextField tf1 = new TextField();
    private TextArea ta1 = new TextArea();
    public ChatClient(String nickname, String servAddr, int servPort)
            throws IOException {
        this.nickname = nickname;
        this.initGraphics(); //그래픽작업과 이벤트 등록 초기화

    }
    public void initGraphics(){
        this.tf1.setBackground(Color.orange);
        this.ta1.setBackground(Color.yellow);
        this.add("North", tf1);
        this.add("Center", ta1);
        this.tf1.addActionListener(this);
        this.addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                      //  stop();
                    }
                }
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = tf1.getText();
        if(!msg.equals("")){
            //	this.sendMessage("[" + nickname + "]:" + msg);
            tf1.setText("");
            ta1.append( msg +"\n");
        }
    }
}