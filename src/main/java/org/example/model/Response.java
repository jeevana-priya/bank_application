package org.example.model;

public class Response<T> {
    private T data;
    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setError(String s) {
    }
}
