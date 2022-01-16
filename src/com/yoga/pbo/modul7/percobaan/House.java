package com.yoga.pbo.modul7.percobaan;

public class House {

    public static void main(String[] args) {
        Tv tv = new Tv("TV");
        Ac ac = new Ac("AC");
        Electronik lamp = new Electronik("Lamp");
        Electronik device = new Electronik();

        tv.activate();
        ac.activate();
        lamp.activate();
        device.activate();

        System.out.println();

        device.deactivate();
        lamp.deactivate();
        ac.deactivate();
        tv.deactivate();
    }
}

