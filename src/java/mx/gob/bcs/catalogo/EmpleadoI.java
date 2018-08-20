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
public interface EmpleadoI {
    
    public int insertaEmpleadoI(EmpleadoBean db) throws SQLException;
    
    public int updateEmpleado(EmpleadoBean db) throws SQLException;
    
    public int deleteEmpleado(EmpleadoBean db) throws SQLException;
    
    public ListIterator<EmpleadoBean> getListaEmpleadoAll() throws SQLException;
    
    public ListIterator<EmpleadoBean> getListaEmpleadoById(int empleado_id) throws SQLException;
}
