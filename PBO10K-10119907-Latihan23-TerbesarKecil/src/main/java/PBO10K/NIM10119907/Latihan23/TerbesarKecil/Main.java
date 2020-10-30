/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan23.TerbesarKecil;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk melihat nilai terbesar terkecil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int jumlahMahasiswa;
        int[] nilaiMahasiswa;
        
        var scanner = new Scanner(System.in);
        
        System.out.println("==== Program Terbesar Terkecil Nilai Mahasiswa ====");
        
        System.out.println("Masukan Nama Petugas : ");
        namaPetugas = scanner.nextLine();
        
        System.out.println("Masukan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();
        
        //initialize array
        nilaiMahasiswa = new int[jumlahMahasiswa];
        
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.printf("Masukan Nilai mahasiswa ke-%d : %n", i);
            nilaiMahasiswa[i-1] = scanner.nextInt();
        }
        
        System.out.println();
        System.out.println("==== Hasil Nilai Mahasiswa ====");
        for (int i = 1; i <= jumlahMahasiswa; i++)
            System.out.printf("Hasil Nilai Mahasiswa ke-%d : %d%n", i, nilaiMahasiswa[i-1]);
        
        System.out.println();
        System.out.printf("Nilai Terbesar Adalah %d\n", Arrays.stream(nilaiMahasiswa).max().getAsInt());
        System.out.printf("Nilai Terkecil Adalah %d", Arrays.stream(nilaiMahasiswa).min().getAsInt());
        
        System.out.println("\n");
        System.out.printf("Petugas : %s", namaPetugas);
    }
    
}
