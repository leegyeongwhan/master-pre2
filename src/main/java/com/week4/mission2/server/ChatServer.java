package com.week4.mission2.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private List<Thread> list;

    public ChatServer() {
        this.list = new ArrayList<>();
        System.out.println("서버가 시작되었습니다.");
    }

    public void chatServerRunner() {
        try {
            this.serverSocket = new ServerSocket(5000);
            this.serverSocket.setReuseAddress(true);

            while (true) {
                this.socket = serverSocket.accept(); //서버가 종료 전까지 게속돌면서 클라이언트를 추가 할시 쓰레드 추가
                ServerSocketThread thread = new ServerSocketThread(this, this.socket);
                addClient(thread);        // 리스트에 쓰레드 객체 저장
                thread.start();
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private synchronized void addClient(ServerSocketThread thread) {
        // 리스트에 ServerSocketThread 객체 저장
        this.list.add(thread);
    }

    //채팅
    public synchronized void broadCasting(String str) {
        for (int i = 0; i < list.size(); i++) {
            ServerSocketThread thread = (ServerSocketThread) this.list.get(i);
            thread.sendMessage(str);
        }
    }
}