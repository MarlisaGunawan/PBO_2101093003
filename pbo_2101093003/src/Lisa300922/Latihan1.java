/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa300922;

import java.io.*;

/**
 *
 * @author A416JPO
 */
public class Latihan1 {
    public static void main(String[] args) {
       BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
       
       String name = "";
       String alamat = "";
       String jurusan = "";
       
        
        try{
            System.out.print("Please Enter Your Name :");
            name = dataIn.readLine();
            System.out.print("Please Enter Your Address :");
            alamat = dataIn.readLine();
            System.out.print("Please Enter Your Major :");
            jurusan = dataIn.readLine();
            }catch(IOException e){
            System.out.println("Error!");
        }
        System.out.println("Hello "+ name +"!" + "\n" 
                + "Alamat Saya : "+ alamat + "\n"
                        +"Jurusan Saya adalah "+ jurusan );
    }
}
