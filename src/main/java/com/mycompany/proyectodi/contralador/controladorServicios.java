/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.proyectodi.contralador;

import com.mycompany.proyectodi.entidades.Servicios;
import com.mycompany.proyectodi.modelo.ServiciosFacadeLocal;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fabian Lobaton
 */
@Named(value = "controladorServicios")
@SessionScoped
public class controladorServicios implements Serializable {

    FacesContext contexto = FacesContext.getCurrentInstance();
    private FacesMessage fm;
    
    private Servicios servi;
    
@EJB
private ServiciosFacadeLocal sfl ;

    public controladorServicios() {
        servi = new Servicios();
    }

    public Servicios getServi() {
        return servi;
    }

    public void setServi(Servicios servi) {
        this. servi = servi;
    }
    public List<Servicios> getAll(){
        try{
            return this.sfl.findAll();
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public void crearServicioP1(){
        contexto = FacesContext.getCurrentInstance();
        this.servi = new Servicios();      
        try{
            contexto.getExternalContext(). redirect("crearservicio.xhtml");
       } catch (IOException e) {           
       }
    }
    public void crearServicio(){
        Date FechaCreacion = new Date(); 
        servi.setFechaCreacion(FechaCreacion);
        contexto = FacesContext.getCurrentInstance();       
        try{
           this.sfl.create(servi);
           fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "El servicio se inserto correctamente", "MSG_INFO");
        } catch (Exception e) {           
           fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error insertando el servicio", "MSG_INFO");
        }
        contexto.addMessage(null, fm);
        this.servi = new Servicios();
       
    }
    
    public void eliminarServicio(Servicios servi){
        contexto = FacesContext.getCurrentInstance();
        this.servi = servi;
        try{
           this.sfl.remove(servi);
           fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "El servicio se elimino correctamente", "MSG_INFO");
        } catch (Exception e) {           
           fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error eliminando el servicio", "MSG_INFO");
        }
        contexto.addMessage(null, fm);
    }
    
        public void actualizarServicioP1(Servicios servi){
        contexto = FacesContext.getCurrentInstance();
        this.servi = servi;
        try{
            contexto.getExternalContext(). redirect("crearservicio.xhtml");
       } catch (IOException e) {           
       }
    }
        public void actualizarServicio(){
        Date FechaCreacion = new Date(); 
        servi.setFechaCreacion(FechaCreacion);
        contexto = FacesContext.getCurrentInstance();
        try{
           this.sfl.edit(servi);
           fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "el servicio se actualizo correctamente", "MSG_INFO");
        } catch (Exception e) {           
           fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error actualizando el servicio", "MSG_INFO");
        }
        contexto.addMessage(null, fm);
    }
                  
}