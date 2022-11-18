/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa211022;

import java.io.*;

/**
 *
 * @author A416JPO
 */
public class Latihan6 {
     public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
        
        String angkabasis="";
        String pangkat="";
        int n;
        String hasil="";
        
        try{
            System.out.print("Masukan Angka Basis : ");
            angkabasis =dataIn.readLine();
            System.out.print("Masukan Angka Pangkat : ");
            pangkat =dataIn.readLine();
                    
            }catch(IOException e){
            System.out.println("Error!");
            }
        int pangkatt = Integer.valueOf(pangkat).intValue();
        int angka = Integer.valueOf(angkabasis).intValue();

        int k=1;
        for(n=1; n<=pangkatt; n++){
            k=k*angka;
        }
        hasil=angka +"^"+pangkat+"="+k;
        System.out.println(hasil);
        
    }
}
