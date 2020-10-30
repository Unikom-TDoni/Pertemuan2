/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan22.Lingkaran;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk kalkulasi lingkaran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float diameter = 0;
        boolean isInputValid = false;
        
        Function<Float, Float> jariLingkaran = diameterLinkaran 
                -> diameterLinkaran / 2;
        
        Function<Float, Double> kelilingLingkaran = diameterLinkaran 
                -> Math.PI * diameterLinkaran;
        
        Function<Float, Double> luasLingkaran = diameterLinkaran 
                -> (0.25f * Math.PI) * Math.pow(diameterLinkaran, 2);
        
        var scanner = new Scanner(System.in);
        
        System.out.println("==================== Perhitungan Lingkaran ====================");
        while(!isInputValid)
        {
            try {
                System.out.println("Masukan Nilai Diameter Lingkaran : ");
                diameter = scanner.nextFloat();
                isInputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter Tidak Sesuai.\n");
                scanner.next();
            }
        }
        
        System.out.println();
        System.out.println("==================== Hasil Perhitungan Lingkaran ====================");
        System.out.printf("Jari Jari Lingkaran = %.0f cm\n", jariLingkaran.apply(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm\n", luasLingkaran.apply(diameter));
        System.out.printf("Keliling Lingkaran = %.2f cm\n", kelilingLingkaran.apply(diameter));
    }  
}
