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
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 1:
                return list.get(rowIndex).getNoid();
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
