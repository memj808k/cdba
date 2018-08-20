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
public interface EquipoComputoI {
    
    public int insertaEquipoComputoI(EquipoComputoBean db) throws SQLException;
    
    public int updateEquipoComputo(EquipoComputoBean db) throws SQLException;
    
    public int deleteEquipoComputo(EquipoComputoBean db) throws SQLException;
    
    public ListIterator<EquipoComputoBean> getListaEquipoComputoAll() throws SQLException;
    
    public ListIterator<EquipoComputoBean> getListaEquipoComputoById(int empleado_id) throws SQLException;
    
}
