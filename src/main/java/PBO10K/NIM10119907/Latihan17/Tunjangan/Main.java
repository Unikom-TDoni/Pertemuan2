/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan17.Tunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung tunjangan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        float gajiPokok;
        float totalGaji;
        float tunjangan = 0;
        String status;
        
        var scanner = new Scanner(System.in);
        
        System.out.println("==================== Program Tunjangan ====================");
        System.out.println("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        gajiPokok = scanner.nextFloat();
        System.out.println("Status Anda ? (Menikah/Belum) : ");
        status = scanner.next(); 
        
        if(gajiPokok >= 6000000 && status.equals("Menikah"))
        {
            tunjangan = 0.35f * gajiPokok;
            totalGaji = gajiPokok + tunjangan;
        }
        else
            totalGaji = gajiPokok;
        
        System.out.println("\n==================== Program Tunjangan ====================");
        System.out.printf("Gaji Pokok \t\t : Rp %.1f%n", gajiPokok);
        System.out.printf("Tunjangan \t\t : Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji \t\t : Rp %.1f%n", totalGaji);
    }
}
