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
public class DependenciaBean extends OficinaBean implements Serializable{

    private int dependencia_id;
    private String dependencia;
    private int responsable_id;
    
    public DependenciaBean() {
    }

    public int getDependencia_id() {
        return dependencia_id;
    }

    public void setDependencia_id(int dependencia_id) {
        this.dependencia_id = dependencia_id;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public int getResponsable_id() {
        return responsable_id;
    }

    public void setResponsable_id(int responsable_id) {
        this.responsable_id = responsable_id;
    }
    
    
    
}
