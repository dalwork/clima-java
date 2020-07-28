package entidades;
// Generated Jun 6, 2020 2:48:40 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Coordenadas generated by hbm2java
 */
public class Coordenadas  implements java.io.Serializable {


     private int idCoordenada;
     private Ciudades ciudades;
     private BigDecimal latitud;
     private BigDecimal longitud;

    public Coordenadas() {
    }

	
    public Coordenadas(int idCoordenada) {
        this.idCoordenada = idCoordenada;
    }
    public Coordenadas(int idCoordenada, Ciudades ciudades, BigDecimal latitud, BigDecimal longitud) {
       this.idCoordenada = idCoordenada;
       this.ciudades = ciudades;
       this.latitud = latitud;
       this.longitud = longitud;
    }
   
    public int getIdCoordenada() {
        return this.idCoordenada;
    }
    
    public void setIdCoordenada(int idCoordenada) {
        this.idCoordenada = idCoordenada;
    }
    public Ciudades getCiudades() {
        return this.ciudades;
    }
    
    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }
    public BigDecimal getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }
    public BigDecimal getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }




}

