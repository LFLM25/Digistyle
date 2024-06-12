/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.proyectodi.contralador;

import com.mycompany.proyectodi.entidades.Usuarios;
import com.mycompany.proyectodi.modelo.UsuariosFacadeLocal;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Controlador para la gestión de usuarios.
 * 
 * @autor Fabian Lobaton
 */
@Named(value = "controladorUsuarios")
@SessionScoped
public class controladorUsuarios implements Serializable {
    
    FacesContext contexto = FacesContext.getCurrentInstance();
    FacesMessage fm;
    
    private Usuarios user;

    @EJB
    private UsuariosFacadeLocal ufl;

    public controladorUsuarios() {
        user = new Usuarios();
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
    
    public void iniciarSesion() {
        contexto = FacesContext.getCurrentInstance();
        try {
            this.ufl.iniciarSesion(user);
            if (user != null) {
                contexto.getExternalContext().redirect("login.xhtml");
            } else {
                fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña inválidos", "MSG_ERROR");
                contexto.addMessage(null, fm);
            }
        } catch (Exception e) {
        }
        user = new Usuarios();
    }
}
