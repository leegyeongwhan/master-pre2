package com.week4.mission2;

import com.week4.mission2.server.ChatServer;

public class ChatServerMain {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        server.giveAndTake();
    }
}