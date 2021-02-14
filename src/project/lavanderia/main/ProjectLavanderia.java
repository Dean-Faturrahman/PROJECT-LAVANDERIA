/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.main;

import java.sql.SQLException;
import javax.swing.SwingUtilities;
import project.lavanderia.database.LavanderiaDatabase;
import project.lavanderia.entity.Pelanggan;
import project.lavanderia.error.pelangganException;
import project.lavanderia.service.PelangganDao;
import project.lavanderia.view.MainFrame;

/**
 *
 * @author Dean
 */
public class ProjectLavanderia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainFrame pelanggan = new MainFrame();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });
    }   
 }    
    