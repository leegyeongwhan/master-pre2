package com.week4.mission2.server;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WritingThread extends Thread{

    Socket socket = null;

    public WritingThread(Socket socket) { // 생성자
        this.socket = socket; // 받아온 Socket Parameter를 해당 클래스 Socket에 넣기
    }

    public void run() {
        try {
            // InputStream - Server에서 보낸 메세지를 클라이언트로 가져옴
            // socket의 InputStream 정보를 InputStream in에 넣은 뒤
            InputStream input = socket.getInputStream();
            // BufferedReader에 위 InputStream을 담아 사용
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            while(true) { // 무한반복
                System.out.println(reader.readLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}