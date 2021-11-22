package com.yoga.pbo.modul7.latihan.Overriding;

public class Motor extends Kendaraan {

    public void bergerak(){
        System.out.println("Motor bergerak dengan dua roda");
    }

    public static void main (String args[]){

        //Membuat objek mobil
        Motor motor = new Motor();

        //Objek mobil menggunakan method bergerak()
        motor.bergerak();
    }
}


