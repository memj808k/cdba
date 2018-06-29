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
public interface DependenciaI {
    
    
    public int insertaDependencia(DependenciaBean db) throws SQLException;
    
    public int updateDependencia(DependenciaBean db) throws SQLException;
    
    public int deleteDependencia(DependenciaBean db) throws SQLException;
    
    public ListIterator<DependenciaBean> getListaDependenciaAll() throws SQLException;
    
    public ListIterator<DependenciaBean> getListaDependenciaById(int dependencia_id) throws SQLException;
    
    
}
