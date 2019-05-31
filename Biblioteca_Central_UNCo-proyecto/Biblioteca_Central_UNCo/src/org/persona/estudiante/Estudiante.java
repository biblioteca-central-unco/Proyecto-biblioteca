/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.estudiante;

import org.persona.Persona;

/**
 *
 * @author gichu
 */
public class Estudiante extends Persona {
    
    public Estudiante(String nombre, String apellido, int dni, int telefono, String direccion, String nombreUsuario, String contraseña, String numeroLegajo) {
        super(nombre, apellido, dni, telefono, direccion, nombreUsuario, contraseña, numeroLegajo);
    }
    
}
