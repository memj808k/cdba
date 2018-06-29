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
public interface SubSecretariaI {
    
    
    public int insertaSubSecretaria(SubSecretariaBean db) throws SQLException;
    
    public int updateSubSecretaria(SubSecretariaBean db) throws SQLException;
    
    public int deleteSubSecretaria(SubSecretariaBean db) throws SQLException;
    
    public ListIterator<SubSecretariaBean> getListaSubSecretariaAll() throws SQLException;
    
    public ListIterator<SubSecretariaBean> getListaSubSecretariaById(int subsecretaria_id) throws SQLException;
}
