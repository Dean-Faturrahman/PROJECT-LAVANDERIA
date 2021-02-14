/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import project.lavanderia.entity.Pelanggan;
import project.lavanderia.entity.Pesanan;

/**
 *
 * @author ryzen
 */
public class TabelPesananModel extends AbstractTableModel{
    private List<Pesanan> list = new ArrayList<Pesanan>();

    public void setList(List<Pesanan> list) {
        this.list = list;
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NOID";
            case 1:
                return "NAMA";
            case 2:
                return "ALAMAT";
            case 3:
                return "TELP";
            case 4:
                return "JENIS";
            case 5:
                return "BERAT";
            case 6:
                return "HARGA";
            default:
                return null;
        }
    }

    public boolean add(Pesanan e) {
        try {
            return list.add(e);
        } finally {
           fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }   
    }



    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNoid();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getAlamat();
            case 3:
                return list.get(rowIndex).getTelp();
            case 4:
                return list.get(rowIndex).getJenis();
            case 5:
                return list.get(rowIndex).getBerat();
            case 6:
                return list.get(rowIndex).getHarga();
            default:
                return null;
        }
    }
}
