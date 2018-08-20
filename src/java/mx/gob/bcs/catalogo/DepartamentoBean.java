/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.bcs.catalogo;

import java.io.Serializable;

/**
 *
 * @author Rembao
 */
public class DepartamentoBean extends DireccionBean implements Serializable{
    
    private int departamento_id;
    private String departamento;

    public DepartamentoBean() {
    }

    public int getDepartamento_id() {
        return departamento_id;
    }

    public void setDepartamento_id(int departamento_id) {
        this.departamento_id = departamento_id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
}
