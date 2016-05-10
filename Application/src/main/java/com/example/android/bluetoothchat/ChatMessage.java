package com.example.android.bluetoothchat;

/**
 * Created by y7un on 2016/5/4.
 */
public class ChatMessage {

    /**
     * name : jadk
     * message : ddddd
     */

    private int type;
    private String name;
    private String message;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
