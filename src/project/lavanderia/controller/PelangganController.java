/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.controller;

import javax.swing.JOptionPane;
import project.lavanderia.model.PelangganModel;
import project.lavanderia.view.TambahAntrianView;

/**
 *
 * @author Dean
 */
public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void insertPelangganView (TambahAntrianView view) {
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telp = view.getTxtTelp().getText();
        String jenis = (String) view.getCmbJenis().getSelectedItem();
        String berat = view.getTxtBerat().getText();
        String harga = view.getTxtHarga().getText();
        String tanggal = view.getTxtTanggal().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(view, "Nama depan tidak boleh lebih dari 255");
        } else if (telp.length() > 12) {
            JOptionPane.showMessageDialog(view, "Nomor telepon tidak boleh lebih dari 12 digit");
        } else if (view.getTxtHarga().getText().equals("")) {
            JOptionPane.showMessageDialog(view, "Klik 'cek harga' dahulu");
        } else {
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelp(telp);
            model.setJenis(jenis);
            double vberat = Double.parseDouble(berat);
            model.setBerat(vberat);
            double vharga = Double.parseDouble(harga);
            model.setHarga(vharga);
            model.setTanggal(tanggal);
            try {
                model.insertPelanggan();
                JOptionPane.showMessageDialog(view, "Data Pelanggan Berhasil Ditambahkan");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{
                    "Terjadi error di database dengan pesan ", throwable.getMessage()
                });
            }
        }
    }
    
    public void updatePelanggan(TambahAntrianView view){
        if (view.getTablePelanggan().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Silakan pilih data pelanggan yang akan diubah");
            return;
        }
        
        Integer id = Integer.parseInt(view.getTxtId().getText());
        
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telp = view.getTxtTelp().getText();
        String jenis = (String) view.getCmbJenis().getSelectedItem();
        String berat = view.getTxtBerat().getText();
        String harga = view.getTxtHarga().getText();
        String tanggal = view.getTxtTanggal().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (nama.length() > 255) {
            JOptionPane.showMessageDialog(view, "Nama depan tidak boleh lebih dari 255");
        } else if (telp.length() > 12) {
            JOptionPane.showMessageDialog(view, "Nomor telepon tidak boleh lebih dari 12 digit");
        } else if (view.getTxtHarga().getText().equals("")) {
            JOptionPane.showMessageDialog(view, "Klik 'cek harga' dahulu");
        } else {
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelp(telp);
            model.setJenis(jenis);
            double vberat = Double.parseDouble(berat);
            model.setBerat(vberat);
            double vharga = Double.parseDouble(harga);
            model.setHarga(vharga);
            model.setTanggal(tanggal);
            
            try {
                model.updatePelanggan();
                JOptionPane.showMessageDialog(view, "Data Pelanggan Berhasil Diubah");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
}