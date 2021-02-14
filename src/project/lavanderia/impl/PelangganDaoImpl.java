/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.lavanderia.entity.Pelanggan;
import project.lavanderia.error.pelangganException;
import project.lavanderia.service.PelangganDao;

/**
 *
 * @author Dean
 */
public class PelangganDaoImpl implements PelangganDao{
    private Connection connection;
    
    private final String insertPelanggan = "INSERT INTO PELANGGAN"
            + " (NAMA, TANGGAL, ALAMAT, TELP, JENIS, BERAT, HARGA) VALUES"
            + " (?,?,?,?,?,?,?)";
    
    private final String updatePelanggan = "UPDATE PELANGGAN SET NAMA=?, "
            + "ALAMAT=?, TELP=?, JENIS=?, BERAT=? WHERE NOID=?";
  
    
    public PelangganDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertPelanggan(Pelanggan pelanggan) throws pelangganException {
        PreparedStatement statement = null;
        
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(insertPelanggan, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, pelanggan.getNama());
            statement.setString(2, pelanggan.getTanggal());
            statement.setString(3, pelanggan.getAlamat());
            statement.setString(4, pelanggan.getTelp());
            statement.setString(5, pelanggan.getJenis());
            statement.setDouble(6, pelanggan.getBerat());
            statement.setDouble(7, pelanggan.getHarga());
            statement.executeUpdate();
            ResultSet result  = statement.getGeneratedKeys();
            if (result.next()) {
                pelanggan.setNoid(result.getInt(1));
            }
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {                
            }
            throw new pelangganException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {                
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e){                    
                }
            }
        }
    }
    

    @Override
    public void updatePelanggan(Pelanggan pelanggan) throws pelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(updatePelanggan);
            statement.setString(1, pelanggan.getNama());
            statement.setString(2, pelanggan.getAlamat());
            statement.setString(3, pelanggan.getTelp());
            statement.setString(4, pelanggan.getJenis());
            statement.setDouble(5, pelanggan.getBerat());
            statement.setInt(6, pelanggan.getNoid());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {                
            }
            throw new pelangganException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {                
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e){                    
                }
            }
        }
    }

    @Override
    public void deletePelanggan(Integer id) throws pelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getPelanggan(Integer id) throws pelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pelanggan> selectAllPelanggan() throws pelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
