/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sector;

import org.sector.publicacion.Publicacion;
import org.sector.tesisCarrera.TesisCarrera;

/**
 *
 * @author gichu
 */
public class Sector {
    private String centralAsignatura;
    private String patagonicaTesis;
    private String posgradoPublicacion;
    private TesisCarrera tesisCarrera;
    private Publicacion publicacion;

    public Sector(TesisCarrera tesisCarrera, Publicacion publicacion) {
        this.tesisCarrera = tesisCarrera;
        this.publicacion = publicacion;
    }

    public TesisCarrera getTesisCarrera() {
        return tesisCarrera;
    }

    public void setTesisCarrera(TesisCarrera tesisCarrera) {
        this.tesisCarrera = tesisCarrera;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Sector(String centralAsignatura, String patagonicaTesis, String posgradoPublicacion) {
        this.centralAsignatura = centralAsignatura;
        this.patagonicaTesis = patagonicaTesis;
        this.posgradoPublicacion = posgradoPublicacion;
    }

    public String getCentralAsignatura() {
        return centralAsignatura;
    }

    public void setCentralAsignatura(String centralAsignatura) {
        this.centralAsignatura = centralAsignatura;
    }

    public String getPatagonicaTesis() {
        return patagonicaTesis;
    }

    public void setPatagonicaTesis(String patagonicaTesis) {
        this.patagonicaTesis = patagonicaTesis;
    }

    public String getPosgradoPublicacion() {
        return posgradoPublicacion;
    }

    public void setPosgradoPublicacion(String posgradoPublicacion) {
        this.posgradoPublicacion = posgradoPublicacion;
    }
    
@Override
public String toString(){
    return this.centralAsignatura;
}
public String toStringPatagonicaTesis(){
    return this.patagonicaTesis;
}
public String toStringPosgradoPublicacion(){
    return this.posgradoPublicacion;
}

}
