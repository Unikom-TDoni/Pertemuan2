/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan30.Cakep;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk Cakep
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    public static void main(String[] args) {
        final String RESET = "\u001B[0m";
        final String MERAH = "\u001B[31m";
        final String HIJAU = "\u001B[32m";
        final String KUNING = "\u001B[33m";
        final String BIRU = "\u001B[34m";
        final String UNGU = "\u001B[35m";
        final String BIRUMUDA = "\u001B[36m";

        String jawab;
        var scanner = new Scanner(System.in);

        System.out.println(MERAH + "Kamu" + HIJAU + " ngerjain sendiri" + KUNING + " latihan 17 sampe" +
                BIRU + " latihan 30 ini? \nJawab" + MERAH + " (Yoi/Enggak) : " + RESET);
        
        jawab = scanner.nextLine().toLowerCase();
        System.out.println();
        switch (jawab) {
            case "yoi":
                System.out.println(MERAH + "Cakep Bener." + UNGU + " Good Job");
                break;
            case "enggak":
                System.out.println(MERAH + "Tetep Cakep Sih." + BIRUMUDA + "\nSing penting paham konsepnya yee." 
                        + RESET + "\nKeep the code works dude");
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
    }
}
