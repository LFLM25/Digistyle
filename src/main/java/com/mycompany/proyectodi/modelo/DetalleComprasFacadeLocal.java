/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectodi.modelo;

import com.mycompany.proyectodi.entidades.DetalleCompras;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Fabian Lobaton
 */
@Local
public interface DetalleComprasFacadeLocal {

    void create(DetalleCompras detalleCompras);

    void edit(DetalleCompras detalleCompras);

    void remove(DetalleCompras detalleCompras);

    DetalleCompras find(Object id);

    List<DetalleCompras> findAll();

    List<DetalleCompras> findRange(int[] range);

    int count();
    
}
