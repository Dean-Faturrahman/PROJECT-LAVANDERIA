/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.entity;

import java.util.Objects;

/**
 *
 * @author Dean
 */
public class Pelanggan {
    private int noid;
    private String nama;
    private String alamat;
    private String telp;
    private String jenis;
    private double berat;
    private double harga;
    private String tanggal;

    public Pelanggan() {
    }

    public Pelanggan(String nama, String alamat, String telp, String jenis, double berat) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.jenis = jenis;
        this.berat = berat;
    }
    

    public int getNoid() {
        return noid;
    }

    public void setNoid(int noid) {
        this.noid = noid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {        
        return harga;
    }

    public void setHarga(double harga) { 
        this.harga = harga;        
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.noid;
        hash = 13 * hash + Objects.hashCode(this.nama);
        hash = 13 * hash + Objects.hashCode(this.alamat);
        hash = 13 * hash + Objects.hashCode(this.telp);
        hash = 13 * hash + Objects.hashCode(this.jenis);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.berat) ^ (Double.doubleToLongBits(this.berat) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.harga) ^ (Double.doubleToLongBits(this.harga) >>> 32));
        hash = 13 * hash + Objects.hashCode(this.tanggal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelanggan other = (Pelanggan) obj;
        if (this.noid != other.noid) {
            return false;
        }
        if (Double.doubleToLongBits(this.berat) != Double.doubleToLongBits(other.berat)) {
            return false;
        }
        if (Double.doubleToLongBits(this.harga) != Double.doubleToLongBits(other.harga)) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.alamat, other.alamat)) {
            return false;
        }
        if (!Objects.equals(this.telp, other.telp)) {
            return false;
        }
        if (!Objects.equals(this.jenis, other.jenis)) {
            return false;
        }
        if (!Objects.equals(this.tanggal, other.tanggal)) {
            return false;
        }
        return true;
    }

    
    
}
