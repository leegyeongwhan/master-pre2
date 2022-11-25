package com.week4.mission2.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServerMain {
    public static void main (String args[]) throws IOException {
        //소켓 만들기
        ServerSocket serverSocket = new ServerSocket (50000);
        System.out.println (50000 + " Port Echo Server Running...");

        //소켓 서버가 종료 될때까지
        while (true) {
            // 소켓 서버 접속시 소켓에 접속자 할당.
            Socket socket = serverSocket.accept();
            System.out.println (new Date().toString() + ":" + socket.toString());
            System.out.println (socket.getLocalPort());
            System.out.println (socket.getPort());
            BufferedReader br;
            BufferedWriter bw;
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String temp = br.readLine();
            bw.write(temp + " 1\n"); bw.flush();
            bw.write(temp + " 2\n"); bw.flush();
            bw.write(temp + " 3\n"); bw.flush();
            br.close();
            bw.close();
            socket.close();
        }
    }
}
