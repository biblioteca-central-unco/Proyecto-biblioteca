/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaDao;

import org.libro.autor.Autor;

/**
 *
 * @author Notebook4
 */
public interface AutorDao {
    public Autor buscarAutorNombre(String Nombre);
    public Autor buscarAutorApellido(String Apellido);
    public Autor buscarAutorNacionalidad(String Nacionalidad);
    public Autor buscarAutorAsignaturaTema(String AsignaturaTema);
    public Autor buscarAutorCantidadEjemplares(int CantidadEjemplares);
    public Autor actualizarAutorAsignaturaTema(String AsignaturaTema);
    public Autor actualizarAutorCantidadEjemplares(String CantidadEjemplares);
}
