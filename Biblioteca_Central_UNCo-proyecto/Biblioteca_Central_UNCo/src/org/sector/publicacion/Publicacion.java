/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sector.publicacion;

/**
 *
 * @author gichu
 */
public class Publicacion {
    private String artCientifico;
    private String revista;
    private String artAcademico;

    public Publicacion(String artCientifico, String revista, String artAcademico) {
        this.artCientifico = artCientifico;
        this.revista = revista;
        this.artAcademico = artAcademico;
    }

    public String getArtCientifico() {
        return artCientifico;
    }

    public void setArtCientifico(String artCientifico) {
        this.artCientifico = artCientifico;
    }

    public String getRevista() {
        return revista;
    }

    public void setRevista(String revista) {
        this.revista = revista;
    }

    public String getArtAcademico() {
        return artAcademico;
    }

    public void setArtAcademico(String artAcademico) {
        this.artAcademico = artAcademico;
    }
@Override
public String toString(){
    return this.artAcademico;
}
public String toStringArtCientifico(){
    return this.artCientifico;
}
public String toStringRevista(){
    return this.revista;
}

}
