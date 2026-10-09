package com.belajar;

import java.util.Scanner;

public class Cmain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan jumlah element array yang kamu mau: ");
        int a = sc.nextInt();
        int data[] = new int[a];

        for (int b = 0; b< data.length; b++){
            System.out.print("Masukan element index ke-" + b + ": ");
            data[b] = sc.nextInt();
        }

        int max = data[0];
        int min = data[0];
        int idmax = 0;
        int idmin = 0;

        for (int i = 1; i < data.length; i++){
            if (data[i] > max){
                max = data[i];
                idmax = i;
            }
            if (data[i] < min){
                min = data[i];
                idmin = i;
            }
        }
      System.out.println("\nNilai maksimumnya adalah= " + max + " di index " + idmax    );
      System.out.println("Nilai minimumnya adalah= " + min + " di index " + idmin    );

        int total = 0;
        for (int g : data) total += g;
        double rata = (double) total / data.length;
        System.out.println("\nTotal dari semua elemen array adalah= " + total);
        System.out.println("Rata-rata dari semua elemen array adalah= " + rata);

        int genap = 0;
        for (int l = 0;l < data.length; l+= 2){
            genap += data[l];
        }
        if (genap % 2 == 0){
            System.out.println("\nJumlah dari semua elemen array berindex genap adalah= " + genap + " (genap)");
        } else {
            System.out.println("\nJumlah dari semua elemen array berindex genap adalah= " + genap + " (ganjil)");
        }

        System.out.println("ini adalah semua element array yang kamu masukan: ");
        for (int m = 0; m < data.length; m++){
            System.out.println("pada index ke-" + m + ": " + data[m] + " ");
        }
    }
}
