/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author Wolf
 */
public class Coordenadas implements Serializable {
    Integer idCoordenada;
    Double latitud;
    Double longitud;
    Ciudades ciudad;

    public Integer getIdCoordenada() {
        return idCoordenada;
    }

    public void setIdCoordenada(Integer idCoordenada) {
        this.idCoordenada = idCoordenada;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    
    public Coordenadas() {
    }
    
}
