/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaannama;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class EjaanNama {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc = new Scanner(System.in);
      System.out.println("Masukkan nama depan anda untuk di eja : ");
      String nama = sc.nextLine();
      int panjang = nama.length();
      char[] stingrArr = nama.toCharArray();
      for (int i = 0; i < panjang; i++) {
          System.out.println("Huruf ke-"+(i+1)+" : "+stingrArr[i]);
        }
    }
    
}
