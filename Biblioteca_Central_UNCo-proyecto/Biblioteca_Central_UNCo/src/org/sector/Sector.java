/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sector;

/**
 *
 * @author gichu
 */
public class Sector {
    private String centralAsignatura;
    private String patagonicaTesis;
    private String posgradoPublicacion;

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
    
}
