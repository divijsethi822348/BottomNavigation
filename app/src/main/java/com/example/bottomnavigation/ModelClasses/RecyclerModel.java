package com.example.bottomnavigation.ModelClasses;

public class RecyclerModel {

    private int helloimg;
    private String hello;

    public RecyclerModel(int helloimg, String hello) {
        this.helloimg = helloimg;
        this.hello = hello;
    }

    public int getHelloimg() {
        return helloimg;
    }

    public void setHelloimg(int helloimg) {
        this.helloimg = helloimg;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
