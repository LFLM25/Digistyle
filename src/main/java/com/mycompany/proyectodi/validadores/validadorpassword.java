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
@FacesValidator (value = "validadorPassword")
public class validadorpassword implements Validator {
    
    @Override    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String password = (String) value;

        if (password.length() < 8) {
            throw new ValidatorException(new FacesMessage("La contraseña debe tener al menos 8 caracteres"));
        }

        if (!password.matches(".*\\d.*")) {
            throw new ValidatorException(new FacesMessage("La contraseña debe contener al menos un número"));
        }

        if (!password.matches(".*[a-zA-Z].*")) {
            throw new ValidatorException(new FacesMessage("La contraseña debe contener al menos una letra"));
        }

    }
}
    
