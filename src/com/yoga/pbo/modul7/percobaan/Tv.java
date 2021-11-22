package com.yoga.pbo.modul7.percobaan;

public class Tv extends Electronik {

    public Tv() {
    }

    public Tv(String name) {
        super(name);
    }

    public void onActivate() {
        System.out.println(this.getName() + " starts displaying image!");
    }

    public void onDeactivate() {
        System.out.println(this.getName() + " stops displaying image!");
    }
}

