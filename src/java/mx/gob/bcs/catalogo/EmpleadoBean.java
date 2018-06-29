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
public class EmpleadoBean extends PersonalBean implements Serializable{

    private int dependencia_id;
    private String dependencia;
    private int subsecretaria_id;
    private String subsecretaria;
    private int direccion_id;
    private String direccion;
    private int departamento_id;
    private String departamento;
    private int cargo_id;
    
    public EmpleadoBean() {
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

    public int getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(int direccion_id) {
        this.direccion_id = direccion_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
