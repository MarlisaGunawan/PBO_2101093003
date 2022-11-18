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
public class Latihan4 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
        
        int angka=0;
        int pangkatt=0;
        int i;
        String hasil="";
        
        try{
            System.out.print("Masukan Angka Basis : ");
            angka =Integer.parseInt(dataIn.readLine());
            System.out.print("Masukan Angka Pangkat : ");
            pangkatt =Integer.parseInt(dataIn.readLine());
                    
            }catch(IOException e){
            System.out.println("Error!");
            }

        int n=1;
        int k=1;
        while(n<=pangkatt){
            n++;
            k=k*angka;
        }
        hasil=angka +"^"+pangkatt+"="+k;
        System.out.println(hasil);
    }
}
