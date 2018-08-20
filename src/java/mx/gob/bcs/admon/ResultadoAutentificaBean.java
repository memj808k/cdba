/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.bcs.admon;

import java.io.Serializable;

/**
 *
 * @author Rembao
 */
public class ResultadoAutentificaBean implements Serializable{

    private int usuario_id;
    private int respuesta;
    
    public ResultadoAutentificaBean() {
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
    
    
}
