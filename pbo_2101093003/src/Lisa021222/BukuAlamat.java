/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisa021222;

/**
 *
 * @author A416JPO
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private int telepon;
    private String email;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getTelepon(){
        return telepon;
    }
    
    public void setTelepon(int telepon){
        this.telepon = telepon;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}
