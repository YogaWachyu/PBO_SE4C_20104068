package com.yoga.pbo.modul7.percobaan;

public class Ac extends Electronik {

    public Ac() {
    }

    public Ac(String name) {
        super(name);
    }

    public void onActivate() {
        System.out.println(this.getName() + " starts cooling the room!");
    }

    public void onDeactivate() {
        System.out.println(this.getName() + " stops cooling the room!");
    }
}

