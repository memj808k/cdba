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
public class SubSecretariaBean extends DependenciaBean implements Serializable{

    private int subsecretaria_id;
    private String subsecretaria;
    
    public SubSecretariaBean() {
    }

    public int getSubsecretaria_id() {
        return subsecretaria_id;
    }

    public void setSubsecretaria_id(int subsecretaria_id) {
        this.subsecretaria_id = subsecretaria_id;
    }

    public String getSubsecretaria() {
        return subsecretaria;
    }

    public void setSubsecretaria(String subsecretaria) {
        this.subsecretaria = subsecretaria;
    }
    
    
    
}
