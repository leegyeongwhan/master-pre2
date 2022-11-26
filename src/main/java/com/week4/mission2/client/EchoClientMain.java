package com.week4.mission2.client;

import java.io.*;
import java.net.Socket;

public class EchoClientMain {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 5000;

    public static void main(String args[]) throws IOException {

        Socket socket = new Socket(SERVER_IP, SERVER_PORT);
        BufferedWriter bw;
        BufferedReader br;
        bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bw.write("Hello, CodeSquad" + "\n");
        bw.flush();
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
        bw.close();
        socket.close();
    }
}
