package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private  int onlineUser;
    private static int count;
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;

    public static int increaseUser(){
        return ++count;
    }

    public static int decreaseUser(){
        return --count;
    }

    public int userNow(int count){
        onlineUser = count;
        return onlineUser;
    }

}


