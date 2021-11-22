package com.yoga.pbo.modul7.latihan.Overloading;

public class Nilai {
    void add() {
        int dsa_mark = 90;
        int dbms_mark = 80;
        int res = dsa_mark +  dbms_mark ;
        System.out.println("Addition of marks : " + res);
    }

    void add(int dsa_mark, int dbms_mark) {
        int res = dsa_mark + dbms_mark;
        System.out.println("Addition of marks : " + res);
    }

    static void add(int dsa_mark, int dbms_mark, int coa_mark) {
        int res = dsa_mark + dbms_mark + coa_mark;
        System.out.println("Addition of marks : " + res);
    }

    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        nilai.add();
        nilai.add(90, 80);
        add(90, 80,90);
    }
}

