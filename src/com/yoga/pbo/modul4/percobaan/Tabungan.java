package com.yoga.pbo.modul4.percobaan;

public class Tabungan {
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    public Tabungan(String nama, int noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = 10000;   //nilai default saldo
        this.pin = 12345; //nilai default pin
    }

    public Tabungan(String nama, int noRekening, int saldo, int pin) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }
    // Getter dan Setter
    public void simpanUang (int jumlah){
        this.saldo += jumlah;
    }
    public void tarikUang (int jumlah){
        this.saldo -= jumlah;
    }
    public void setSaldo (int saldo) {
        this.saldo = saldo;
    }

    public void setPin(int pin) {
        this.pin= pin;
    }

    public String getNama() {
        return nama;
    }

    public int getnoRekening() {
        return noRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }
}
