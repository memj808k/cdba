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
public class OficinaBean implements Serializable{
    
    private String calle_principal;
    private String calle_entre;
    private String calle_y;
    private String correo;
    private String telefono;
    private String extension;
    private String colonia;
    private String num_exterior;
    private String num_interior;
    private String codigo_postal;
    
    private int creado_por;
    private String fecha_creacion;
    private int modificado_por;
    private String fecha_modificacion;
    
}
