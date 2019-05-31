/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.libro;

import org.libro.asignatura.Asignatura;

/**
 *
 * @author gichu
 */
public class Libro {
    private String codigoLibro;
    private String titulo;
    private String editorial;
    private String autor;
    private String idioma; 
    private Boolean disponibilidad; 
    private Asignatura asignatura;

    public Libro(String codigoLibro, String titulo, String editorial, String autor, String idioma, String asignatura, Boolean disponibilidad) {
        this.codigoLibro = codigoLibro;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.idioma = idioma;
        this.disponibilidad = disponibilidad;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Libro(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    

}
