/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.SQLException;
import view.view;

/**
 *
 * @author erlan
 */
public interface controller {
    public void Simpan(view crud) throws SQLException;
    public void Reset(view crud) throws SQLException;
    
}
