/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.lavanderia.model.TabelPesananModel;
import project.lavanderia.database.LavanderiaDatabase;
import project.lavanderia.entity.Pesanan;


/**
 *
 * @author ryzen
 */
public class DataTerambilView extends javax.swing.JPanel {

    private LavanderiaDatabase db;
    private TabelPesananModel model;
    private Pesanan pesanan;
    private DefaultTableModel tabModel;
    
    /**
     * Creates new form DataTerambil
     */
    public DataTerambilView() {
        initComponents();
        model = new TabelPesananModel();
        TablePesanan.setModel(model);
        getData();
    }
    
    public void getData( ){
        try{
            Statement stat = LavanderiaDatabase.getConnection().createStatement();
            String sql  = "Select * from pesanan_ambil";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next()){
                pesanan = new Pesanan();
                pesanan.setNoid(res.getInt("NOID"));
                pesanan.setTanggal(res.getString("TANGGAL"));
                pesanan.setNama(res.getString("NAMA"));
                pesanan.setAlamat(res.getString("ALAMAT"));
                pesanan.setTelp(res.getString("TELP"));
                pesanan.setJenis(res.getString("JENIS"));
                pesanan.setBerat(res.getDouble("BERAT"));
                pesanan.setHarga(res.getDouble("HARGA"));

                model.add(pesanan);
            }
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePesanan = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnHapus = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(181, 174, 236));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        jLabel1.setText("Data Terambil");

        TablePesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablePesanan);

        jButton2.setBackground(new java.awt.Color(10, 212, 66));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OK");

        btnHapus.setBackground(new java.awt.Color(255, 51, 51));
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHapusMousePressed(evt);
            }
        });

        jLabel2.setText("HAPUS");

        javax.swing.GroupLayout btnHapusLayout = new javax.swing.GroupLayout(btnHapus);
        btnHapus.setLayout(btnHapusLayout);
        btnHapusLayout.setHorizontalGroup(
            btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHapusLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnHapusLayout.setVerticalGroup(
            btnHapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(389, 389, 389)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMousePressed
        try{
            int selectedRow = TablePesanan.getSelectedRow();
            Object rowID = model.getValueAt(selectedRow,0);
            
            String delete = "DELETE FROM pesanan_ambil WHERE NOID = "+ rowID +"";
            
            Connection conn = LavanderiaDatabase.getConnection();
            PreparedStatement PS = conn.prepareStatement(delete);
            PS.execute();
            JOptionPane.showMessageDialog(null, "Data dengan ID "+ rowID + "sudah di ambil");
        }catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
            
    }//GEN-LAST:event_btnHapusMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePesanan;
    private javax.swing.JPanel btnHapus;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}