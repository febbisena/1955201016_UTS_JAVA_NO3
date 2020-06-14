/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMPLE_PROJECT;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Simple_Project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("======= Program Segitiga Siku-Siku Bintang =======");
        System.out.println("1. Segitiga Siku-Siku Tegak ke Kanan");
        System.out.println("2. Segitiga Siku-Siku Tegak ke Kiri");
        System.out.println("3. Segitiga Siku-Siku Terbalik ke Kanan");
        System.out.println("4. Segitiga Siku-Siku Terbalik ke Kiri");
        System.out.println("");    
        System.out.print("Anda Ingin Membuat Segitiga yang ke Berapa? ");
            int menu = input.nextInt();
           
        System.out.println("");
        
        switch(menu){
            case 1:
                System.out.print("Masukkan Tinggi Segitiga = ");
                    int tinggi = input.nextInt();
                for(int i=1; i<=tinggi; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.print("Masukkan Tinggi Segitiga = ");
                    tinggi = input.nextInt();
                for(int i=1; i<=tinggi; i++){
                    for(int j=tinggi; j>i; j--){
                        System.out.print(" ");
                    }
                    for(int k=1; k<=i; k++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.print("Masukkan Tinggi Segitiga = ");
                    tinggi = input.nextInt();
                for(int i=1; i<=tinggi; i++){
                    for(int j=tinggi; j>=i; j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.out.print("Masukkan Tinggi Segitiga = ");
                    tinggi = input.nextInt();
                for(int i=1; i<=tinggi; i++){
                    for(int j=1; j<i; j++){
                        System.out.print(" ");
                    }
                    for(int k=tinggi; k>=i; k--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            default :
                System.out.println("Anda Memilih Menu yang Salah!");
        }
    }
}
