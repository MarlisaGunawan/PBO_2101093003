/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa300922;

import javax.swing.JOptionPane;

/**
 *
 * @author A416JPO
 */
public class Latihan4 {
    public static void main(String[] args){
        int angka1 =0;
        int angka2 =0;
        int jumlah =0;
        
        angka1 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Angka 1 :"));
        
        angka2 = Integer.parseInt(JOptionPane.showInputDialog("Masukan Angka 2 :"));
        
        jumlah = angka1 + angka2;
        
        JOptionPane.showMessageDialog(null, "Jumlah = "+ jumlah);
    }
}
