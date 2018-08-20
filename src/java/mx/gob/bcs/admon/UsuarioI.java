/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.bcs.admon;

import java.sql.SQLException;
import java.util.ListIterator;

/**
 *
 * @author Rembao
 */
public interface UsuarioI {
    
    public int insertaUsuarioI(UsuarioBean db) throws SQLException;
    
    public int updateUsuario(UsuarioBean db) throws SQLException;
    
    public int deleteUsuario(UsuarioBean db) throws SQLException;
    
    public ListIterator<UsuarioBean> getListaUsuarioAll() throws SQLException;
    
    public ListIterator<UsuarioBean> getListaUsuarioById(int empleado_id) throws SQLException;
    
}
