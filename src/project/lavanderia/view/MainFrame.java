/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.view;

/**
 *
 * @author ryzen
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        DataBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AmbilBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TerambilBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TambahBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LogoUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BGPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        TambahPesananPanel = new javax.swing.JPanel();
        tambahAntrianView1 = new project.lavanderia.view.TambahAntrianView();
        DataPesananPanel = new javax.swing.JPanel();
        dataPesananView2 = new project.lavanderia.view.DataPesananView();
        AmbilPesananPanel = new javax.swing.JPanel();
        ambilPesananView2 = new project.lavanderia.view.AmbilPesananView();
        PesananTerambilPanel = new javax.swing.JPanel();
        dataTerambilView1 = new project.lavanderia.view.DataTerambilView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuPanel.setBackground(new java.awt.Color(121, 122, 240));
        MenuPanel.setPreferredSize(new java.awt.Dimension(256, 720));

        DataBtn.setBackground(new java.awt.Color(255, 206, 217));
        DataBtn.setPreferredSize(new java.awt.Dimension(169, 41));
        DataBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataBtnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Data Pesanan");

        javax.swing.GroupLayout DataBtnLayout = new javax.swing.GroupLayout(DataBtn);
        DataBtn.setLayout(DataBtnLayout);
        DataBtnLayout.setHorizontalGroup(
            DataBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataBtnLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        DataBtnLayout.setVerticalGroup(
            DataBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        AmbilBtn.setBackground(new java.awt.Color(255, 206, 217));
        AmbilBtn.setPreferredSize(new java.awt.Dimension(169, 41));
        AmbilBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmbilBtnMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Ambil Pesanan");

        javax.swing.GroupLayout AmbilBtnLayout = new javax.swing.GroupLayout(AmbilBtn);
        AmbilBtn.setLayout(AmbilBtnLayout);
        AmbilBtnLayout.setHorizontalGroup(
            AmbilBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmbilBtnLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(37, 37, 37))
        );
        AmbilBtnLayout.setVerticalGroup(
            AmbilBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmbilBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        TerambilBtn.setBackground(new java.awt.Color(255, 206, 217));
        TerambilBtn.setPreferredSize(new java.awt.Dimension(169, 41));
        TerambilBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TerambilBtnMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Data Terambil");

        javax.swing.GroupLayout TerambilBtnLayout = new javax.swing.GroupLayout(TerambilBtn);
        TerambilBtn.setLayout(TerambilBtnLayout);
        TerambilBtnLayout.setHorizontalGroup(
            TerambilBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TerambilBtnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        TerambilBtnLayout.setVerticalGroup(
            TerambilBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TerambilBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        TambahBtn.setBackground(new java.awt.Color(255, 206, 217));
        TambahBtn.setPreferredSize(new java.awt.Dimension(169, 41));
        TambahBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahBtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Tambah Pesanan");

        javax.swing.GroupLayout TambahBtnLayout = new javax.swing.GroupLayout(TambahBtn);
        TambahBtn.setLayout(TambahBtnLayout);
        TambahBtnLayout.setHorizontalGroup(
            TambahBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahBtnLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        TambahBtnLayout.setVerticalGroup(
            TambahBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TambahBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(LogoUser))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmbilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TerambilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(LogoUser)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(TambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(DataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(AmbilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(TerambilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BGPanel.setBackground(new java.awt.Color(250, 251, 255));
        BGPanel.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(250, 251, 255));

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        BGPanel.add(HomePanel, "card2");

        TambahPesananPanel.setBackground(new java.awt.Color(250, 251, 255));

        tambahAntrianView1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout TambahPesananPanelLayout = new javax.swing.GroupLayout(TambahPesananPanel);
        TambahPesananPanel.setLayout(TambahPesananPanelLayout);
        TambahPesananPanelLayout.setHorizontalGroup(
            TambahPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahPesananPanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(tambahAntrianView1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        TambahPesananPanelLayout.setVerticalGroup(
            TambahPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahPesananPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(tambahAntrianView1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        BGPanel.add(TambahPesananPanel, "card3");

        DataPesananPanel.setBackground(new java.awt.Color(250, 251, 255));

        javax.swing.GroupLayout DataPesananPanelLayout = new javax.swing.GroupLayout(DataPesananPanel);
        DataPesananPanel.setLayout(DataPesananPanelLayout);
        DataPesananPanelLayout.setHorizontalGroup(
            DataPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPesananPanelLayout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(dataPesananView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        DataPesananPanelLayout.setVerticalGroup(
            DataPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPesananPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(dataPesananView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        BGPanel.add(DataPesananPanel, "card4");

        AmbilPesananPanel.setBackground(new java.awt.Color(250, 251, 255));

        javax.swing.GroupLayout AmbilPesananPanelLayout = new javax.swing.GroupLayout(AmbilPesananPanel);
        AmbilPesananPanel.setLayout(AmbilPesananPanelLayout);
        AmbilPesananPanelLayout.setHorizontalGroup(
            AmbilPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmbilPesananPanelLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(ambilPesananView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        AmbilPesananPanelLayout.setVerticalGroup(
            AmbilPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmbilPesananPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(ambilPesananView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        BGPanel.add(AmbilPesananPanel, "card5");

        PesananTerambilPanel.setBackground(new java.awt.Color(250, 251, 255));

        javax.swing.GroupLayout PesananTerambilPanelLayout = new javax.swing.GroupLayout(PesananTerambilPanel);
        PesananTerambilPanel.setLayout(PesananTerambilPanelLayout);
        PesananTerambilPanelLayout.setHorizontalGroup(
            PesananTerambilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesananTerambilPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(dataTerambilView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        PesananTerambilPanelLayout.setVerticalGroup(
            PesananTerambilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesananTerambilPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(dataTerambilView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        BGPanel.add(PesananTerambilPanel, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahBtnMouseClicked
        BGPanel.removeAll();
        BGPanel.repaint();
        BGPanel.revalidate();
        
        BGPanel.add(TambahPesananPanel);
        BGPanel.repaint();
        BGPanel.revalidate();
    }//GEN-LAST:event_TambahBtnMouseClicked

    private void DataBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataBtnMouseClicked
        BGPanel.removeAll();
        BGPanel.repaint();
        BGPanel.revalidate();
        
        BGPanel.add(DataPesananPanel);
        BGPanel.repaint();
        BGPanel.revalidate();
    }//GEN-LAST:event_DataBtnMouseClicked

    private void AmbilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmbilBtnMouseClicked
        BGPanel.removeAll();
        BGPanel.repaint();
        BGPanel.revalidate();
        
        BGPanel.add(AmbilPesananPanel);
        BGPanel.repaint();
        BGPanel.revalidate();
    }//GEN-LAST:event_AmbilBtnMouseClicked

    private void TerambilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TerambilBtnMouseClicked
        BGPanel.removeAll();
        BGPanel.repaint();
        BGPanel.revalidate();
        
        BGPanel.add(PesananTerambilPanel);
        BGPanel.repaint();
        BGPanel.revalidate();
    }//GEN-LAST:event_TerambilBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AmbilBtn;
    private javax.swing.JPanel AmbilPesananPanel;
    private javax.swing.JPanel BGPanel;
    private javax.swing.JPanel DataBtn;
    private javax.swing.JPanel DataPesananPanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel LogoUser;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel PesananTerambilPanel;
    private javax.swing.JPanel TambahBtn;
    private javax.swing.JPanel TambahPesananPanel;
    private javax.swing.JPanel TerambilBtn;
    private project.lavanderia.view.AmbilPesananView ambilPesananView2;
    private project.lavanderia.view.DataPesananView dataPesananView2;
    private project.lavanderia.view.DataTerambilView dataTerambilView1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private project.lavanderia.view.TambahAntrianView tambahAntrianView1;
    // End of variables declaration//GEN-END:variables
}
