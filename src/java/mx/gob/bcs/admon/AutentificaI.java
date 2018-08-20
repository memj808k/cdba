/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.bcs.admon;

import java.util.ArrayList;

/**
 *
 * @author Rembao
 */
public interface AutentificaI {
    
    public ArrayList<ResultadoAutentificaBean> autentificaUsuario(String usuario, String contrasena);
    
    
}
