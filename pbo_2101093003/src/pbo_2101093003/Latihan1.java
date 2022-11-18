/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_2101093003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author A416JPO
 */
public class Latihan1 {
     public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
        
        int angka1=0;
        int angka2=0;
        int angka3=0;
        int hasil;
        
        try{
            System.out.print("Inputkan Angka 1  :");
            angka1 =Integer.parseInt(dataIn.readLine());
            System.out.print("Inputkan Angka 2  :");
            angka2 =Integer.parseInt(dataIn.readLine());
            System.out.print("Inputkan Angka 3  :");
            angka3 =Integer.parseInt(dataIn.readLine());
                    
            }catch(IOException e){
            System.out.println("Error!");
        }
        hasil = (angka1 >= angka2)?angka1:angka2;
        hasil = (angka3 >= hasil)?angka3:hasil;
        System.out.println("Nilai tertingginya adalah angka = "+hasil);
    }
}
