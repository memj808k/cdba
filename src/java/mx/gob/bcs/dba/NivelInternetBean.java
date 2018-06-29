/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.bcs.dba;

import java.io.Serializable;

/**
 *
 * @author Rembao
 */
public class NivelInternetBean implements Serializable{
    
    private int nivel_id;
    private String nivel;
    private String descripcion;
    private int creado_por;
    private String fecha_creacion;
    private int modificado_por;
    private String fecha_modicacion;

    public NivelInternetBean() {
    }

    public int getNivel_id() {
        return nivel_id;
    }

    public void setNivel_id(int nivel_id) {
        this.nivel_id = nivel_id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public int getCreado_por() {
        return creado_por;
    }

    public void setCreado_por(int creado_por) {
        this.creado_por = creado_por;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getModificado_por() {
        return modificado_por;
    }

    public void setModificado_por(int modificado_por) {
        this.modificado_por = modificado_por;
    }

    public String getFecha_modicacion() {
        return fecha_modicacion;
    }

    public void setFecha_modicacion(String fecha_modicacion) {
        this.fecha_modicacion = fecha_modicacion;
    }
    
    
    
    
}
