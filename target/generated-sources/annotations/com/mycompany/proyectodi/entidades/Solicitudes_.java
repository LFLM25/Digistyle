package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Servicios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Solicitudes.class)
public class Solicitudes_ { 

    public static volatile SingularAttribute<Solicitudes, String> descripcion;
    public static volatile SingularAttribute<Solicitudes, Integer> solicitudId;
    public static volatile SingularAttribute<Solicitudes, String> estado;
    public static volatile SingularAttribute<Solicitudes, Servicios> servicioId;
    public static volatile SingularAttribute<Solicitudes, Date> fechaCreacion;

}