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

@FacesValidator (value="validadorNombre")
public class validadornombre implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object o) throws ValidatorException {
        String valor = (String) o;

        if (valor.length() > 2) {
            throw new ValidatorException(new FacesMessage( "El nombre debe tener máximo 2 caracteres"));
        }

        if (!valor.matches("[a-zA-Z]+")) {
            throw new ValidatorException(new FacesMessage("El nombre solo debe contener letras"));
        }
    }
}