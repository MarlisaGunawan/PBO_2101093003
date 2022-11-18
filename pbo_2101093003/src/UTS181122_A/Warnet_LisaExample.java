/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS181122_A;

import UTS181122_A.Warnet_Lisa;

/**
 *
 * @author A416JPO
 */
public class Warnet_LisaExample {
    public static void main(String[] args){
        Warnet_Lisa pelanggan1 = new Warnet_Lisa();
        
        pelanggan1.setKode("01");
        pelanggan1.setNamaPelanggan("Marlisa Gunawan");
        pelanggan1.setJenisPelanggan("VIP");
        pelanggan1.setTanggal("18-11-22");
        pelanggan1.setJamMasuk(8);
        pelanggan1.setJamKeluar(12);
        pelanggan1.setTarif(5000);
        
        
        System.out.println("Kode            : "+pelanggan1.getKode());
        System.out.println("Nama Pelanggan  : "+pelanggan1.getNamaPelanggan());
        System.out.println("Jenis Pelanggan : "+pelanggan1.getJenisPelanggan());
        System.out.println("Tangal          : "+pelanggan1.getTanggal());
        System.out.println("Jam Masuk       : "+pelanggan1.getJamMasuk());
        System.out.println("Jam Keluar      : "+pelanggan1.getJamKeluar());
        System.out.println("Lama            : "+pelanggan1.getLama());
        System.out.println("Diskon          : "+pelanggan1.getDiskon());
        System.out.println("Tarif           : "+pelanggan1.getTarif());
        System.out.println("Total           : "+pelanggan1.getTotal());
    }
}
