/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_central_unco;

/**
 *
 * @author Susana
 */
public class Biblioteca {
    private String dirección;
    private String pagWeb;
    private int telefono;

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Biblioteca(String dirección, String pagWeb, int telefono) {
        this.dirección = dirección;
        this.pagWeb = pagWeb;
        this.telefono = telefono;
    }
    
}
