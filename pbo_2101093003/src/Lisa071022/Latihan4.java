/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa071022;

import java.io.*;

/**
 *
 * 
 * @author A416JPO
 */
public class Latihan4 {
    public static void main( String[] args ) throws IOException 
    { 
        BufferedReader dataIn = new BufferedReader (
                new InputStreamReader(System.in));
        
        int angka1=0;
        int angka2=0;
        int angka3=0;
        int hasil,rata_rata;
        
        try{
            System.out.print("Nilai Pertama\t1: ");
            angka1 =Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai Kedua\t2: ");
            angka2 =Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai Ketiga\t3: ");
            angka3 =Integer.parseInt(dataIn.readLine());
                    
            }catch(IOException e){
            System.out.println("Error!");
            }
        rata_rata=((angka1 + angka2 + angka3)/3);
        System.out.println("Rata-Rata\t: "+rata_rata);
        if(rata_rata>=60){
            System.out.println(":)");
        }else {
            System.out.println(":(");
        }
      
        
    }
}
