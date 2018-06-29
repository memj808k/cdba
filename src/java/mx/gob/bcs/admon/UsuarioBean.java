/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.bcs.admon;

import java.io.Serializable;
import mx.gob.bcs.catalogo.PersonalBean;

/**
 *
 * @author Rembao
 */
public class UsuarioBean extends PersonalBean implements Serializable{

   
    private String usuario;
    private String contrasena;
    
    public UsuarioBean() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
    
}
