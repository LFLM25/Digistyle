/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyectodi.modelo;

import com.mycompany.proyectodi.entidades.Inventarios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Fabian Lobaton
 */
@Local
public interface InventariosFacadeLocal {

    void create(Inventarios inventarios);

    void edit(Inventarios inventarios);

    void remove(Inventarios inventarios);

    Inventarios find(Object id);

    List<Inventarios> findAll();

    List<Inventarios> findRange(int[] range);

    int count();
    
}
