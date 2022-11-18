/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_2101093003;

import java.io.*;

/**
 *
 * @author A416JPO
 */
public class Latihan2 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
        
        int angka=0;
        String status ="";
        
        try{
            System.out.print("Inputkan Angka  :");
            angka =Integer.parseInt(dataIn.readLine());
                    
            }catch(IOException e){
            System.out.println("Error!");
        }
        status = (angka/2!=0 && angka/2==0)?"genap":"ganjil";
        //status = ((angka/2==1) && (angka/2!=0))?"ganjil":"genap";
        System.out.println("Nilai adalah angka = " +status);
    }
}
