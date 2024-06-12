/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.proyectodi.contralador;

import com.mycompany.proyectodi.entidades.Servicios;
import com.mycompany.proyectodi.entidades.Solicitudes;
import com.mycompany.proyectodi.modelo.ServiciosFacadeLocal;
import com.mycompany.proyectodi.modelo.SolicitudesFacadeLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author Fabian Lobaton
 */
@Named(value = "controladorSolicitud")
@ViewScoped
public class controladorSolicitud implements Serializable {

    List<SelectItem> listaservicios;
    FacesContext contexto;
    FacesMessage fm;
    Servicios servi = new Servicios();
    Solicitudes Solicit = new Solicitudes();
    
    @EJB
    private ServiciosFacadeLocal sfl;
    @EJB
    private SolicitudesFacadeLocal olf;
    
    public controladorSolicitud() {
    }

    public List<SelectItem> getListaservicios() {
    listaservicios = new ArrayList<>();
        try {
            for(Servicios var : this.sfl.findAll()){
            SelectItem item = new SelectItem(var.getServicioId(), var.getNombre());
            listaservicios.add(item);
            
            }   
          return listaservicios;
        } catch (Exception e) {           
        }
        return null;
    
    }

    public void setListaservicios(List<SelectItem> listaservicios) {
        this.listaservicios = listaservicios;
    }

    public Servicios getServi() {
        return servi;
    }

    public void setServi(Servicios Servi) {
        this.servi = servi;
    }

    public Solicitudes getSolicit() {
        return Solicit;
    }

    public void setSolicit(Solicitudes Solicit) {
        this.Solicit = Solicit;
    }
    
    public void crearsolicitud(){
    Date FechaCreacion = new Date(); 
    Solicit.setFechaCreacion(FechaCreacion);
        contexto = FacesContext.getCurrentInstance();
        try {
            this.Solicit.setServicioId(servi);
            this.olf.create(Solicit);
            fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Se inserto la solicitud correctamente","MSG_INFO");
        } catch (Exception e) {
            fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error insertando solicitud","MSG_INFO");
        }
    contexto.addMessage(null, fm);
    this.Solicit = new Solicitudes();
    }
    
    public List<Solicitudes> listarSolicitudes(){
        try {
            return this.olf.findAll();
        } catch (Exception e) {
        }
    
    return null;
    }
    
}
