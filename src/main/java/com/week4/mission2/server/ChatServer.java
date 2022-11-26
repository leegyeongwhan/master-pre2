package com.week4.mission2.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private List<Thread> list;        // ServerSocketThread 객체 저장

    public ChatServer() {
        list = new ArrayList<>();
        System.out.println("서버가 시작되었습니다.");
    }

    public void chatServerRunner() {
        try {
            this.serverSocket = new ServerSocket(5000);        // 소켓 접속 대기
            this.serverSocket.setReuseAddress(true);        // ServerSocket이 port를 바로 다시 사용한다 설정(port를 잡고있음)

            while (true) {
                this.socket = serverSocket.accept();            // accept -> 1. 소켓 접속 대기 2. 소켓 접속 허락
                ServerSocketThread thread = new ServerSocketThread(this, this.socket);    // this -> ChatServer 자신
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