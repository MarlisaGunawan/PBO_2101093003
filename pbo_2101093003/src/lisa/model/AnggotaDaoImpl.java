/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisa.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A416JPO
 */
public class AnggotaDaoImpl implements AnggotaDao {
    
    private List<Anggota> data = new ArrayList<>();

    public AnggotaDaoImpl() {
        data.add(new Anggota("1111","Ali","Padang"));
        data.add(new Anggota("1112","Ani","Padang"));
        data.add(new Anggota("1113","Budi","Padang Panjang"));
    }
    
    /*@Override*/
    public Anggota sava(Anggota anggota) {
        data.add(anggota);
        return anggota;
    }

    @Override
    public Anggota update(int index, Anggota anggota) {
        data.set(index, anggota);
        return anggota;
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public List<Anggota> getAllAnggota() {
        return data;
    }

    @Override
    public Anggota getAnggota(int index) {
        return data.get (index);
    }

    
}