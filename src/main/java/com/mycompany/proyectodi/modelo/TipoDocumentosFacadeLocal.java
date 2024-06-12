/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectodi.modelo;

import com.mycompany.proyectodi.entidades.TipoDocumentos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Fabian Lobaton
 */
@Local
public interface TipoDocumentosFacadeLocal {

    void create(TipoDocumentos tipoDocumentos);

    void edit(TipoDocumentos tipoDocumentos);

    void remove(TipoDocumentos tipoDocumentos);

    TipoDocumentos find(Object id);

    List<TipoDocumentos> findAll();

    List<TipoDocumentos> findRange(int[] range);

    int count();
    
}
