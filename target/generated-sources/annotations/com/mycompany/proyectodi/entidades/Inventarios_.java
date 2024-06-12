package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Productos;
import com.mycompany.proyectodi.entidades.Proveedores;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Inventarios.class)
public class Inventarios_ { 

    public static volatile SingularAttribute<Inventarios, Integer> inventarioId;
    public static volatile ListAttribute<Inventarios, Proveedores> proveedoresList;
    public static volatile SingularAttribute<Inventarios, Date> fechaCreacion;
    public static volatile ListAttribute<Inventarios, Productos> productosList;
    public static volatile SingularAttribute<Inventarios, Integer> cantidad;
    public static volatile SingularAttribute<Inventarios, String> nombre;

}