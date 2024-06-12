/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectodi.modelo;

import com.mycompany.proyectodi.entidades.DetalleVentas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Fabian Lobaton
 */
@Local
public interface DetalleVentasFacadeLocal {

    void create(DetalleVentas detalleVentas);

    void edit(DetalleVentas detalleVentas);

    void remove(DetalleVentas detalleVentas);

    DetalleVentas find(Object id);

    List<DetalleVentas> findAll();

    List<DetalleVentas> findRange(int[] range);

    int count();
    
}
