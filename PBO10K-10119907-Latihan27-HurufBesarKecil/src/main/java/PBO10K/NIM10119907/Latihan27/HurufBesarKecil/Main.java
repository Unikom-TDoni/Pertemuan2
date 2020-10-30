/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan27.HurufBesarKecil;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan huruf besar kecil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        var scanner = new Scanner(System.in);
        System.out.println("Masukan Kalimat : ");
        kalimat = scanner.nextLine();
        
        System.out.println("\n===== Hasil Formating =====");
        System.out.println("Huruf Besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(kalimat.toLowerCase()));
    }
    
}
