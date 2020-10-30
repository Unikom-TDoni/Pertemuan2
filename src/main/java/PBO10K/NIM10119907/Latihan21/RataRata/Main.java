/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan21.RataRata;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung rata rata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float jumlahMahasiswa;
        float totalNilai = 0;
        
        var scanner = new Scanner(System.in);
        
        System.out.println("Masukan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();
        
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.printf("Nilai mahasiswa ke-%d : %n", i);
            totalNilai += scanner.nextFloat();
        }
        
        System.out.println();
        System.out.printf("Maka, Rata Rata Nilainya Adalah %.1f", totalNilai / jumlahMahasiswa);
    }
}
