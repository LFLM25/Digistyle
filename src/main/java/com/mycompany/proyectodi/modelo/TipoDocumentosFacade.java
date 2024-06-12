/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodi.modelo;

import com.mycompany.proyectodi.entidades.TipoDocumentos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fabian Lobaton
 */
@Stateless
public class TipoDocumentosFacade extends AbstractFacade<TipoDocumentos> implements TipoDocumentosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_proyectodi_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoDocumentosFacade() {
        super(TipoDocumentos.class);
    }
    
}
