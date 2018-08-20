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
public class EquipoComputoBean extends EmpleadoBean implements Serializable{
    
    private int equipo_id;
    private String ns; // numero de serie
    private String nb; // numero de bien
    private int tipo_equipo_id;
    private String tipo_equipo;
    private String ip;
    private String host;
    private int marca_id;
    private String marca;
    private int os_id;
    private String os;
    private int os_version_id;
    private String os_version;
    private int ram;
    private String tipo_ram;
    private int procesador_id;
    private String procesador;
    private String procesador_velocidad;
    private String chipset;
    private String video;
    private int licencia_os; // 1 = si o 0 = no
    private int licencia_paqueteria;
    private String software;
    private int paqueteriaOfimatica_id;
    private String paqueteriaOfimatica;
    private int antivirus_id;
    private String antivirus;
    
    
    public EquipoComputoBean(){
    }

    public int getEquipo_id() {
        return equipo_id;
    }

    public void setEquipo_id(int equipo_id) {
        this.equipo_id = equipo_id;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getNb() {
        return nb;
    }

    public void setNb(String nb) {
        this.nb = nb;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(int marca_id) {
        this.marca_id = marca_id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getOs_id() {
        return os_id;
    }

    public void setOs_id(int os_id) {
        this.os_id = os_id;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getOs_version_id() {
        return os_version_id;
    }

    public void setOs_version_id(int os_version_id) {
        this.os_version_id = os_version_id;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getTipo_ram() {
        return tipo_ram;
    }

    public void setTipo_ram(String tipo_ram) {
        this.tipo_ram = tipo_ram;
    }

    public int getProcesador_id() {
        return procesador_id;
    }

    public void setProcesador_id(int procesador_id) {
        this.procesador_id = procesador_id;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getProcesador_velocidad() {
        return procesador_velocidad;
    }

    public void setProcesador_velocidad(String procesador_velocidad) {
        this.procesador_velocidad = procesador_velocidad;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getTipo_equipo_id() {
        return tipo_equipo_id;
    }

    public void setTipo_equipo_id(int tipo_equipo_id) {
        this.tipo_equipo_id = tipo_equipo_id;
    }

    public String getTipo_equipo() {
        return tipo_equipo;
    }

    public void setTipo_equipo(String tipo_equipo) {
        this.tipo_equipo = tipo_equipo;
    }

    public int getLicencia_os() {
        return licencia_os;
    }

    public void setLicencia_os(int licencia_os) {
        this.licencia_os = licencia_os;
    }

    public int getLicencia_paqueteria() {
        return licencia_paqueteria;
    }

    public void setLicencia_paqueteria(int licencia_paqueteria) {
        this.licencia_paqueteria = licencia_paqueteria;
    }

    

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public int getPaqueteriaOfimatica_id() {
        return paqueteriaOfimatica_id;
    }

    public void setPaqueteriaOfimatica_id(int paqueteriaOfimatica_id) {
        this.paqueteriaOfimatica_id = paqueteriaOfimatica_id;
    }

    public String getPaqueteriaOfimatica() {
        return paqueteriaOfimatica;
    }

    public void setPaqueteriaOfimatica(String paqueteriaOfimatica) {
        this.paqueteriaOfimatica = paqueteriaOfimatica;
    }

    public int getAntivirus_id() {
        return antivirus_id;
    }

    public void setAntivirus_id(int antivirus_id) {
        this.antivirus_id = antivirus_id;
    }

    public String getAntivirus() {
        return antivirus;
    }

    public void setAntivirus(String antivirus) {
        this.antivirus = antivirus;
    }
    
    
    
    
}
