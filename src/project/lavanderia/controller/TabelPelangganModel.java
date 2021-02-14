/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import project.lavanderia.entity.Pelanggan;

/**
 *
 * @author ACER
 */
public class TabelPelangganModel extends AbstractTableModel{
    
    private List<Pelanggan> list = new ArrayList<Pelanggan>();

    public void setList(List<Pelanggan> list) {
        this.list = list;
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NOID";
            case 1:
                return "TANGGAL";
            case 2:
                return "NAMA";
            case 3:
                return "ALAMAT";
            case 4:
                return "TELP";
            case 5:
                return "JENIS";
            case 6:
                return "BERAT";
            case 7:
                return "HARGA";
            default:
                return null;
        }
    }

    public boolean add(Pelanggan e) {
        try {
            return list.add(e);
        } finally {
           fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }   
    }

    public Pelanggan get(int index) {
        return list.get(index);
    }

    public Pelanggan set(int index, Pelanggan element) {
        try {
        
        return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
        
    }

    public Pelanggan remove(int index) {
        try {
        return list.remove(index);    
        } finally {
            fireTableRowsDeleted(index, index);
        }
        
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNoid();
            case 1:
                return list.get(rowIndex).getTanggal();
            case 2:
                return list.get(rowIndex).getNama();
            case 3:
                return list.get(rowIndex).getAlamat();
            case 4:
                return list.get(rowIndex).getTelp();
            case 5:
                return list.get(rowIndex).getJenis();
            case 6:
                return list.get(rowIndex).getBerat();
            case 7:
                return list.get(rowIndex).getHarga();
            default:
                return null;
        }
    }
}
