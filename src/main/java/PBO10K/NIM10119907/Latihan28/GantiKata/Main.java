/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan28.GantiKata;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk mengganti kata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimatAwal;
        String kataDiganti;
        String kataPengganti;

        var scanner = new Scanner(System.in);
        System.out.println("===== Program Mengganti Kata =====\n");
        
        System.out.println("Masukan Kalimat : ");
        kalimatAwal = scanner.nextLine();
        
        System.out.println("Ganti Kata : ");
        kataDiganti = scanner.nextLine();

        System.out.println("Menjadi Kata : ");
        kataPengganti = scanner.nextLine();
        
        System.out.println("\n===== Hasil Formating =====");
        System.out.printf("Kalimat Awal : %s\n", kalimatAwal);
        System.out.printf("Kalimat Baru : %s", kalimatAwal.replace(kataDiganti, kataPengganti));
    }
}
