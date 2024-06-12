/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodi.contralador;

import com.mycompany.proyectodi.entidades.Empleados;
import com.mycompany.proyectodi.modelo.EmpleadosFacadeLocal;
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
@Named(value = "controladorEmpleados")
@SessionScoped
public class controladorEmpleados implements Serializable {
    
    FacesContext contexto = FacesContext.getCurrentInstance();
    FacesMessage fm;
    
    private Empleados emp;
    
    
@EJB
private EmpleadosFacadeLocal efl ;

    public controladorEmpleados() {
      
    }
    
    public Empleados getEmp() {
        return emp;
    } 
    
    public void setEmp(Empleados emp) {
        this. emp = emp;
    }
    
    public List<Empleados> getAll(){
        try {
            return this.efl.findAll();
        } catch (Exception e) { 
            
        }
        return null;          
    }
    
    public void crearEmpleadoP1(){
        try {
            emp = new Empleados();
            contexto = FacesContext.getCurrentInstance();
            contexto.getExternalContext().redirect("crearempleado.xhtml");
        } catch (Exception e) {
        }
    }
    
    
    public void crearEmpleado(){
        Date FechaCreacion = new Date(); 
        emp.setFechaCreacion(FechaCreacion);
        contexto = FacesContext.getCurrentInstance(); 
        try{
           this.efl.create(emp);
           fm = new FacesMessage(FacesMessage.SEVERITY_INFO, " se inserto correctamente", "MSG_INFO");
        } catch (Exception e) {           
           fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error insertando ", "MSG_INFO");          
        }
        contexto.addMessage(null, fm);
        this.emp = new Empleados();
    }
    
    public void eliminarEmpleado(Empleados emp){
        contexto = FacesContext.getCurrentInstance();
        this.emp = emp;
        try{
           this.efl.remove(emp);
           fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "El empleado se elimino correctamente", "MSG_INFO");
        } catch (Exception e) {           
           fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error eliminando el empleado", "MSG_INFO");
        }
        contexto.addMessage(null, fm);
    }
    
    public void actualizarEmpleadoP1(Empleados emp){
        contexto = FacesContext.getCurrentInstance();
        this.emp = emp;
        try{
            contexto.getExternalContext(). redirect("crearempleado.xhtml");
       } catch (Exception e) {           
       }
    }
        public void actualizarEmpleado(){
        Date FechaCreacion = new Date(); 
        emp.setFechaCreacion(FechaCreacion);
        contexto = FacesContext.getCurrentInstance();
        try{
           this.efl.edit(emp);
           fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "el servicio se actualizo correctamente", "MSG_INFO");
        } catch (Exception e) {           
           fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error actualizando el servicio", "MSG_INFO");
        }
        contexto.addMessage(null, fm);
    }
                        
            
       
}
