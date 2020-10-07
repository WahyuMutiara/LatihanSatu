/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NUGROHO
 */
import java.util.Scanner;
public class Kelulusan1 {
     public static void main(String[] args) {
        
        // Buat Variabel dan Scanner
        Scanner inp = new Scanner(System.in);
        
        // Ambil Nama
        System.out.print("Masukkan nama anda = ");
        String nama = inp.nextLine();
        
        // Ambil NIM
        System.out.print("Masukkan NIM anda = ");
        String NIM = inp.next();
        
        // Ambil Nilai
        System.out.print("Masukkan Nilai anda = ");
        int nilai = inp.nextInt();
        
        //Print
       if ( nilai >= 79 ){
           System.out.println("Selamat anda lulus.");
       }
       else{
           System.out.println("Anda tidak lulus.");
       }
    }
}
     
        
       