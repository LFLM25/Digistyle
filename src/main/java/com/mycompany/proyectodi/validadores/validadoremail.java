/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodi.validadores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


/**
 *
 * @author Fabian Lobaton
 */

@FacesValidator (value="validadorEmail")
public class validadoremail implements Validator{

    @Override    public void validate(FacesContext context, UIComponent component, Object o) throws ValidatorException {
        String email = (String) o;
        
        if(email.length()>50) {
            throw new ValidatorException(new FacesMessage("Debe tener maximo 20 caracteres"));    
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new ValidatorException(new FacesMessage("El correo electrónico no es válido"));
        }

    }

    
}    
    