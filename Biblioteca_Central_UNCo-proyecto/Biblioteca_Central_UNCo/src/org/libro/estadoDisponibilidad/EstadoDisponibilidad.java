/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.libro.estadoDisponibilidad;

/**
 *
 * @author gichu
 */
public class EstadoDisponibilidad {
    private Boolean disponibilidad;
    private int cantidadEjemplares; 

    public EstadoDisponibilidad(Boolean disponibilidad, int cantidadEjemplares) {
        this.disponibilidad = disponibilidad;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    
}
