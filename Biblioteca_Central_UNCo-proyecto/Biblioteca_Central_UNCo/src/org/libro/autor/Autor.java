/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.libro.autor;

/**
 *
 * @author gichu
 */
public class Autor {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String asignaturaTema;
    private int cantidadEjemplares;

    public Autor(String nombre, String apellido, String nacionalidad, String asignaturaTema, int cantidadEjemplares) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.asignaturaTema = asignaturaTema;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getAsignaturaTema() {
        return asignaturaTema;
    }

    public void setAsignaturaTema(String asignaturaTema) {
        this.asignaturaTema = asignaturaTema;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    
    
}
