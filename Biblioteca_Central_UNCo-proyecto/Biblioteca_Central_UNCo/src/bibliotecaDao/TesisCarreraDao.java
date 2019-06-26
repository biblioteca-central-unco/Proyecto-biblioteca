/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaDao;

import org.sector.tesisCarrera.TesisCarrera;

/**
 *
 * @author Notebook4
 */
public interface TesisCarreraDao {
   public TesisCarrera buscarTesisCarreraTesisDoc(String TesisDoctorado);
   public TesisCarrera buscarTesisCarreraTesisPos(String TesisPosgrado);
   public TesisCarrera buscarTesisCarreraTesisGrado(String TesisGrado);
   public TesisCarrera actualizarTesisCarreraTesisDoc(String TesisDoctorado);
   public TesisCarrera actualizarTesisCarreraTesisPos(String TesisPosgrado);
   public TesisCarrera actualizarTesisCarreraTesisGrado(String TesisGrado);
   
}
