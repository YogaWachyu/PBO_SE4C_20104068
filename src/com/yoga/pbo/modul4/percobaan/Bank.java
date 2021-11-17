package com.yoga.pbo.modul4.percobaan;

public class Bank {
    public class main {
        public static void main(String[] args) {
            // Pembuatan objek baru dari class Tabungan
            Tabungan saya = new Tabungan("Barca", 50410420,1000000,12345);

            // Demonstrasi method Getter
            System.out.println("Nama \t : " + saya.getNama());
            System.out.println("noRekening \t : " + saya.getnoRekening());
            System.out.println("saldo \t : " + saya.getSaldo());
            System.out.println("pin \t : " + saya.getPin());
        }
    }
}
