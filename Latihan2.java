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
public class Latihan2 {
    public static void main ( String [] args){
        //Buat Scanner
        Scanner input = new Scanner(System.in);
        
        //Deklarasi variabel metode
        System.out.print("Masukkan nilai = ");
        int nilai = input.nextInt();
        
        //Print
        if(nilai < 56) {
        System.out.println("E"); 
        } 
        else if(nilai < 66) {
        System.out.println("D");
        } 
        else if(nilai < 76) { 
        System.out.println("C");
        }
        else if(nilai < 86 ) {
        System.out.println("B"); 
        } 
        else if(nilai < 101) {
        System.out.println("A"); 
        }        
        else{
        System.out.println("Error"); 
        } 
    
    }
}
