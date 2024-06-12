package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, Integer> rolId;
    public static volatile ListAttribute<Rol, Usuarios> usuariosList;
    public static volatile SingularAttribute<Rol, Date> fechaCreacion;
    public static volatile SingularAttribute<Rol, String> nombre;

}