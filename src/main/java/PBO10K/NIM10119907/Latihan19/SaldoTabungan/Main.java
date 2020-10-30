/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan19.SaldoTabungan;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan saldo tabungan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float saldo;
        float bunga;
        int lamaMenabung;
        
        var scanner = new Scanner(System.in);
        
        System.out.println("Masukan Saldo Awal Anda \t\t: Rp. ");
        saldo = scanner.nextFloat();
        
        System.out.println("Masukan Bunga/Bulan Anda (%) \t\t: ");
        bunga = scanner.nextFloat()/100;
        
        System.out.println("Masukan Lama Anda Menabung (Bulan) \t: ");
        lamaMenabung = scanner.nextInt();
        
        System.out.println();
        
        for (int i = 1; i <= lamaMenabung; i++)
        {
            String thousandFormat = String.format("%,.0f%n", saldo += (bunga*saldo)).replace(',', '.');
            System.out.printf("Saldo di bulan ke-%d Rp.%s",i,thousandFormat);
        }
    }
}
