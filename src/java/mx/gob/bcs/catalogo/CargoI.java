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
public interface CargoI {
    
    public int insertaCargo(CargoBean db) throws SQLException;
    
    public int updateCargo(CargoBean db) throws SQLException;
    
    public int deleteCargo(CargoBean db) throws SQLException;
    
    public ListIterator<CargoBean> getListaCargoAll() throws SQLException;
    
    public ListIterator<CargoBean> getListaCargoById(int cargo_id) throws SQLException;
}
