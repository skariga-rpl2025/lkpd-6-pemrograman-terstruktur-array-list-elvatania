/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MencariIndexArray;

import java.util.Scanner;

/**
 *
 * 
 */
public class PencarianArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Input jumlah elemen array
        System.out.println("Input jumlah elemen Array: ");
        int n = input.nextInt();
        
        int[] angka = new int[n];
        
        //Input elemen array satu persatu
        System.out.println("Input" + n + "angka(dipisah dengan enter):");
        for (int i = 0; i < n; i++){
            angka[i] = input.nextInt();
        }
        
        //Input angka yang dicari
        System.out.println("Input angka yang dicari: ");
        int cari = input.nextInt();
        
        //Proses pencarian (Linear Search)
        boolean ditemukan = false;
        for (int i = 0; i < n; i++){
            if (angka[i] == cari){
                System.out.println("Angka ditemukan pada index ke-" + i);
                ditemukan = true;
                break; //berhenti jika angka sudah ditemukan
            }
        }
        
        //jika ditemukan
        if(!ditemukan){
            System.out.println("Angka tidak ditemukan");
        }
        
        input.close();
    }
}
