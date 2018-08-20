/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.bcs.dba;

/**
 *
 * @author Rembao
 */
public class PermisoUsuarioInternetBean {
    
    private int permiso_id;
    private int empleado_id;
    private int nivel_id;
    private String descripcion;
    private String fecha_alta;
    private String fecha_baja;
    private String fecha_reactivacion;
    private String observacion;
    private int estatus;
    

    public PermisoUsuarioInternetBean() {
    }

    public int getPermiso_id() {
        return permiso_id;
    }

    public void setPermiso_id(int permiso_id) {
        this.permiso_id = permiso_id;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getFecha_reactivacion() {
        return fecha_reactivacion;
    }

    public void setFecha_reactivacion(String fecha_reactivacion) {
        this.fecha_reactivacion = fecha_reactivacion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    
    

    public int getNivel_id() {
        return nivel_id;
    }

    public void setNivel_id(int nivel_id) {
        this.nivel_id = nivel_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(String fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
    
    
}
