/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.event;

import project.lavanderia.entity.Pelanggan;
import project.lavanderia.model.PelangganModel;

/**
 *
 * @author Dean
 */
public interface PelangganListener {
    //parameter dari pelanggan model
    public void onChange(PelangganModel model);
    
    //parameter dari entity database pelanggan
    public void onInsert(Pelanggan pelanggan);
    
    //tidak ada parameter
    public void onDelete();
    
    //parameter dari entity database pelanggan
    public void onUpdate(Pelanggan pelanggan);
}
