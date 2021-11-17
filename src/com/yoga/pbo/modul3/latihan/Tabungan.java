package com.yoga.pbo.modul3.latihan;

public class Tabungan {
    public int saldo1;
    public Tabungan (int saldo2){
        this.saldo1 = saldo2;
    }
    public int getSaldo() {

        return saldo1;
    }
    public void simpanUang(int jumlah){

        saldo1 += jumlah;
    }
    public boolean ambilUang(int jumlah) {
        if (saldo1 >= jumlah){
            saldo1 -= jumlah;
            return true;
        }
        return false;
    }
}

