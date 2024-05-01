package com.bus.bus.helper;

import java.util.List;

public class HttpMyResponse<T> {
    private boolean status;
    private int code;
    private String message;
    private List<T> result;

    // Constructors, getters, setters


    public HttpMyResponse() {
    }

    public HttpMyResponse(boolean status, int code, String message, List<T> result) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }


    public void setSingleResult(T updatedBus) {
    }
}
