/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS181122_A;

/**
 *
 * @author A416JPO
 */
public class Warnet_Lisa {
    private String kode;
    private String namapelanggan;
    private String jenispelanggan;
    private String tanggal;
    private int jamMasuk;
    private int jamKeluar;
    private int tarif;
    private int lama;
    private double diskon;
    private double total;
    
    private static int pelangganCount;
    
    public String getKode(){
        return kode;
    }
    
    public void setKode(String kode){
        this.kode=kode;
    }
    
    public String getNamaPelanggan(){
        return namapelanggan;
    }
    
    public void setNamaPelanggan(String namapelanggan){
        this.namapelanggan=namapelanggan;
    }
    
    public String getJenisPelanggan(){
        return jenispelanggan;
    }
    
    public void setJenisPelanggan(String jenispelanggan){
        this.jenispelanggan=jenispelanggan;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal=tanggal;
    }
    
    public int getJamKeluar(){
        return jamKeluar;
    }
    
    public void setJamKeluar(int jamKeluar){
        this.jamKeluar=jamKeluar;
    }
    
    public int getJamMasuk(){
        return jamMasuk;
    }
    
    public void setJamMasuk(int jamMasuk){
        this.jamMasuk=jamMasuk;
    }
    
    public int getTarif(){
        return tarif;
    }
    
    public void setTarif(int tarif){
        this.tarif=tarif;
    }
    
    public int getPelangganCount(){
        return pelangganCount;
    }
    
    public int getLama(){
        lama = jamKeluar-jamMasuk;
        return lama;
    }
    
    public double getDiskon(){
        diskon=tarif*0.02;
        return diskon;
    }
    
    public double getTotal(){
        total=lama*tarif-diskon;
        return total;
    }
}
