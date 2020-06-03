package com.fancy.cancer.common.utils;

public class CustomError {
    private String url;        //跳转路径
    private String message;       //提示文字
    private String time;       //等待时间
    private String title;      //提示标题

    public CustomError() {
    }

    public CustomError(String url, String message, String time, String title) {
        this.url = url;
        this.message = message;
        this.time = time;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
