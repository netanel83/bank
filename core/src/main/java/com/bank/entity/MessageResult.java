package com.bank.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class MessageResult {
    private String data;
    private int code;
    private String message;

    public MessageResult(int code, String msg) {
        this.code = code;
        this.message = msg;
    }
    public MessageResult() {}
    public MessageResult(int code, String msg, String object) {
        this.code = code;
        this.message = msg;
        this.data = object;
    }


    public static MessageResult success() {
        return new MessageResult(0, "SUCCESS");
    }

    public static MessageResult success(String msg) {
        return new MessageResult(0, msg);
    }

    public static MessageResult success(String msg, String data) {
        return new MessageResult(0, msg, data);
    }

    public static MessageResult error(int code, String msg) {
        return new MessageResult(code, msg);
    }

    public static MessageResult error(String msg) {
        return new MessageResult(500, msg);
    }

}