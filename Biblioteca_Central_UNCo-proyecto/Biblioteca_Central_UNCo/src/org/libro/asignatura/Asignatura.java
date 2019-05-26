/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.libro.asignatura;

/**
 *
 * @author gichu
 */
public class Asignatura {
    private String nombreAsign;
    private int codigo;

    public Asignatura(String nombreAsign, int codigo) {
        this.nombreAsign = nombreAsign;
        this.codigo = codigo;
    }
    public String getNombreAsign() {
        return nombreAsign;
    }

    public void setNombreAsign(String nombreAsign) {
        this.nombreAsign = nombreAsign;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
