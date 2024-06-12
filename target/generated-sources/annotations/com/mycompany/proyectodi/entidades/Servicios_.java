package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Solicitudes;
import com.mycompany.proyectodi.entidades.Usuarios;
import com.mycompany.proyectodi.entidades.Ventas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile ListAttribute<Servicios, Usuarios> usuariosList;
    public static volatile SingularAttribute<Servicios, String> estado;
    public static volatile SingularAttribute<Servicios, Integer> servicioId;
    public static volatile SingularAttribute<Servicios, Date> fechaCreacion;
    public static volatile ListAttribute<Servicios, Ventas> ventasList;
    public static volatile ListAttribute<Servicios, Solicitudes> solicitudesList;
    public static volatile SingularAttribute<Servicios, String> nombre;

}