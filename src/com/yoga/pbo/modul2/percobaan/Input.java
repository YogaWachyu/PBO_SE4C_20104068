package com.yoga.pbo.modul2.percobaan;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int var_a, var_b;

        System.out.print("Masukan nilai var var_a : ");
        var_a = input.nextInt();
        System.out.print("Masukan nilai var var_b : ");
        var_b = input.nextInt();

        // output akhir program
        System.out.println();
        System.out.println("Variabel yang terdapat dalam program :");
        System.out.println("var_a = " +var_a);
        System.out.println("var_b = " +var_b);
    }
}