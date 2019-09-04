package com.dicoding.javafundamental.DataType;

import java.text.Normalizer;

public class Switch {
    public static void main(String[] args) {
        normal();
        WithoutBreak();
    }

     private static void normal()
    {
        int input = 6;
        switch (input) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            default:
                break;
        }
    }

    private static void WithoutBreak()
    {
        char input = 'C';
        int output = 0;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                // Program akan menjalankan kode di dalam case ini
                output++; // output = 1

                // Karena di akhir case C tidak ada break, maka program akan menjalankan case selanjutnya
            case 'D':
                // Kode ini akan dijalankan oleh program
                output++; // output = 2
            case 'E':
                // Kode ini akan dijalankan oleh program
                output++; // output = 3
            default:
                // Case default juga akan dijalankan
                output++; // output = 4
        }
        System.out.println("Nilai akhirnya adalah " + output);
    }
}
