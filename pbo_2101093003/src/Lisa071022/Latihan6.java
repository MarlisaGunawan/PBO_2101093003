/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa071022;

import javax.swing.JOptionPane;
/**
 *
 * @author A416JPO
 */
public class Latihan6 {
    public static void main(String[] args){
        int angka=0;
        String hasil="";
        angka =Integer.parseInt(JOptionPane.showInputDialog("Masukan Angka :"));
         
         if (angka>=1 && angka<=10){
             hasil += "Valid Number";
         }else{
             hasil += "Invalid Number";
         }
         JOptionPane.showMessageDialog(null, hasil);
    }
}
