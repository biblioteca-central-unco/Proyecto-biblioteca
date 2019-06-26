/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona;

/**
 *
 * @author gichu
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;
    private String direccion;
    private String nombreUsuario;
    private String contraseña;
    private String numeroLegajo;

    public Persona(String nombre, String apellido, int dni, int telefono, String direccion, String nombreUsuario, String contraseña, String numeroLegajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.numeroLegajo = numeroLegajo;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(String numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }


    public Persona(String nombre, String apellido, int dni, int cuil, int telefono, String direccion, String nombreUsuario, String contraseña, String numeroLegajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni; 
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.numeroLegajo = numeroLegajo;
    }
}