/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sector.tesisCarrera;

/**
 *
 * @author gichu
 */
public class TesisCarrera {
    private String tesisPosgrado;
    private String tesisDoctorado;
    private String tesisGrado;

    public TesisCarrera(String tesisPosgrado, String tesisDoctorado, String tesisGrado) {
        this.tesisPosgrado = tesisPosgrado;
        this.tesisDoctorado = tesisDoctorado;
        this.tesisGrado = tesisGrado;
    }

    public String getTesisPosgrado() {
        return tesisPosgrado;
    }

    public void setTesisPosgrado(String tesisPosgrado) {
        this.tesisPosgrado = tesisPosgrado;
    }

    public String getTesisDoctorado() {
        return tesisDoctorado;
    }

    public void setTesisDoctorado(String tesisDoctorado) {
        this.tesisDoctorado = tesisDoctorado;
    }

    public String getTesisGrado() {
        return tesisGrado;
    }

    public void setTesisGrado(String tesisGrado) {
        this.tesisGrado = tesisGrado;
    }
    
}
