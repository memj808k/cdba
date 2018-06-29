/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.bcs.catalogo;

import java.sql.SQLException;
import java.util.ListIterator;

/**
 *
 * @author Rembao
 */
public interface DireccionI {
    
    
    public int insertaDireccion(DireccionBean db) throws SQLException;
    
    public int updateDireccion(DireccionBean db) throws SQLException;
    
    public int deleteDireccion(DireccionBean db) throws SQLException;
    
    public ListIterator<DireccionBean> getListaDireccionAll() throws SQLException;
    
    public ListIterator<DireccionBean> getListaDireccionById(int direccion_id) throws SQLException;
    
    
}
