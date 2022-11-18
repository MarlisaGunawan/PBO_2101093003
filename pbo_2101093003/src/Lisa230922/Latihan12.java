/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa230922;

/**
 *
 * @author A416JPO
 */
public class Latihan12 {
    public static void main(String[] args) {
        int number1 =10;
        int number2 =23;
        int number3 =5;
        int hasil;

        System.out.println("number 1 = "+number1);
        System.out.println("number 2 = "+number2);
        System.out.println("number 3 = "+number3);
        
        hasil = (number1 >= number2)?number1:number2;
        hasil = (number3>= hasil)?number3:hasil;
        System.out.println("Nilai tertingginya adalah angka = "+hasil);
    }
}

