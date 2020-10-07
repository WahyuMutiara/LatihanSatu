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
public class Latihan3 {
    public static void main ( String [] args){
        
        //Buat Scanner 
        Scanner input = new Scanner (System.in);
       
        
        //Ambil Jenis Kelamin
        System.out.print("Masukkan JenisKelamin = ");
        String JenisKelamin = input.nextLine();
        
        //Ambil Tinggi Badan 
        System.out.print("Masukkan TinggiBadan = ");
        int TinggiBadan = input.nextInt();
        
        //Print
        if("LakiLaki".equals(JenisKelamin)) {
            if( TinggiBadan   >= 171 && TinggiBadan   <= 230  ) { 
             System.out.println("Selamat Anda Lulus"); 
             } 
            else { 
            System.out.println("Anda Gagal"); 
            }
} 
        else if("Perempuan".equals(JenisKelamin)) { 
            if( TinggiBadan   >= 161 && TinggiBadan   <= 210 ) { 
            System.out.println("Selamat Anda Lulus"); 
            } 
            else { 
            System.out.println("Anda Gagal"); 
     }
} 
    }
    
}
