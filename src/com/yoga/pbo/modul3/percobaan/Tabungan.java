package com.yoga.pbo.modul3.percobaan;

public class Tabungan {
    public int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;

    }
    public void Ambiluang (int jumlah){

        saldo -= jumlah;
    }
}
