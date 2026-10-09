package com.belajar;

import javax.swing.JOptionPane;

public class Bmain {
    public static void main(String[] args){
        int data[] = new int[10];
        for (int a = 0; a < data.length; a++){
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukan Element index ke-" + a));
            System.out.println("Index ke-" + a + " adalah " + data[a]);
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

        int total = 0;
        for (int g : data) total += g;
        double rata = (double) total / data.length;

        System.out.println("\nNilai maksimumnya adalah= " + max + " di index " + idmax);
        System.out.println("Nilai minimumnya adalah= " + min + " di index " + idmin);
        System.out.println("Rata-rata dari semua elemen array adalah= " + rata);


        String caris = JOptionPane.showInputDialog("Masukkan angka yang ingin dicari indexnya: ");
        int cari = Integer.parseInt(caris);
        int posisi = -1;
        for (int i = 0; i < data.length; i++){
            if (data[i] == cari){
                posisi = i;
                break;
            }
        }

        if (posisi != -1){
            System.out.println("\nPergantian nilai Berjalan");
            String barus = JOptionPane.showInputDialog("Nilai ditemukan di index ke-" + posisi + ". Masukkan nilai baru untuk menggantikannya : ");
            int baru = Integer.parseInt(barus);

            System.out.println("Index yang diubah adalah index ke-" + posisi + " dengan nilai= " + data[posisi] + " diganti menjadi= " + baru);

            data[posisi] = baru;
            
            System.out.println("\nArray setelah penggantian nilai: ");
            for (int i = 0; i < data.length; i++){
                System.out.println("Index ke-" + i + " adalah " + data[i]);
            }
        } else {
            System.out.println("\nPergantian nilai tidak berjalan");
            JOptionPane.showMessageDialog(null, "Nilai tidak ditemukan dalam array.");
        }


    }

}
