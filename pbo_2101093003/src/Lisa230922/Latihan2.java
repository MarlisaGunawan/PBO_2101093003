/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa230922;

import java.text.DecimalFormat;

/**
 *
 * @author A416JPO
 */
public class Latihan2 {
    public static void main(String[] args) {
        DecimalFormat formatdata = new DecimalFormat("#.##");
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;
      
      //sedikit angka  
        System.out.println("Variabel values ...");
        System.out.println("    i = " + i);
        System.out.println("    j = " + j);
        System.out.println("    x = " + x);
        System.out.println("    y = " + y);
            
      //penjumalhan angka
        System.out.println("Adding...");
        System.out.println("    i + j = " + (i + j));
        System.out.println("    x + y = " + (x + y));
        
      //pengurangan angka
        System.out.println("Subtracting...");
        System.out.println("    i - j = " + (i - j));
        System.out.println("    x - y = " + formatdata.format(x - y));
        
      //perkalian angka
        System.out.println("Multiplying...");
        System.out.println("    i * j = " + (i * j));
        System.out.println("    x * y = " + formatdata.format(x * y));
        
      //Pembagian angka 
        System.out.println("Dividing...");
        System.out.println("    i / j = " + (i / j));
        System.out.println("    x / y = " + formatdata.format(x / y));
        
        //menghitung hasil modulus dari pembagian
        System.out.println("Computing the remaider...");
            
        //tipe penggabungan
        System.out.println("Mixing tipes...");
        System.out.println("    j + x = " + (j + y));
        System.out.println("    i * x = " + formatdata.format(i * x));
    }
}