/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.model;

import java.sql.SQLException;
import project.lavanderia.database.LavanderiaDatabase;
import project.lavanderia.entity.Pelanggan;
import project.lavanderia.error.pelangganException;
import project.lavanderia.event.PelangganListener;
import project.lavanderia.service.PelangganDao;

/**
 *
 * @author Dean
 */
public class PelangganModel {
    private int noid;
    private String nama;
    private String alamat;
    private String telp;
    private String jenis;
    private double berat;
    private double harga;
    private PelangganListener listener;

    public PelangganListener getListener() {
        return listener;
    }

    public void setListener(PelangganListener listener) {
        this.listener = listener;
    }
        
    public int getNoid() {
        return noid;
    }

    public void setNoid(int noid) {
        this.noid = noid;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        fireOnChange();
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
        fireOnChange();
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
        fireOnChange();
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
        fireOnChange();
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
        fireOnChange();
    }
    
    protected void fireOnChange() {
        if (listener != null){
            listener.onChange(this);
        }
    }
    
    protected void fireOnInsert(Pelanggan pelanggan) {
        if (listener != null) {
            listener.onInsert(pelanggan);
        }
    }
    
    public void insertPelanggan() throws SQLException, pelangganException{
        PelangganDao dao = LavanderiaDatabase.getPelangganDao();
        
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setTelp(telp);
        pelanggan.setJenis(jenis);        
        pelanggan.setBerat(berat);
        pelanggan.setHarga(pelanggan.getHarga());
        
        dao.insertPelanggan(pelanggan);
        fireOnInsert(pelanggan);
    }

    public void resetPelanggan() {
        setNama("");
        setAlamat("");
        setTelp("");
        setJenis("");        
        setBerat(0);
        setHarga(0);
    }
}
