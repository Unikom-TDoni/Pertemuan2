/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan24.Perbandingan;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk melihat perbandingan nilai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int firstNumber;
        int secondNumber;
        boolean isProgramFinish = false;
        var scanner = new Scanner(System.in);
        
        while(!isProgramFinish)
        {
            System.out.println("Masukan Nilai Pertama : ");
            firstNumber = scanner.nextInt();
            System.out.println("Masukan Nilai Kedua : ");
            secondNumber = scanner.nextInt();
            System.out.print("Hasil : ");
            printHasil(firstNumber,secondNumber);
            
            System.out.println("\n\nUlangi Aktifitas ? (Ya/Tidak) : ");
            isProgramFinish = !scanner.next().equals("Ya");
            System.out.println();
        }
    }
    
    public static void printHasil(int firstNumber,int secondNumber)
    {
        if(firstNumber > secondNumber)
            System.out.printf("%d Lebih Besar Dari %d",firstNumber, secondNumber);
        else if(firstNumber < secondNumber)
            System.out.printf("%d Lebih Kecil Dari %d", firstNumber, secondNumber);
        else
            System.out.printf("%d Sama Dengan %d", firstNumber, secondNumber);
    }

}