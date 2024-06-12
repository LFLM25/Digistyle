package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Productos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, String> descripcion;
    public static volatile SingularAttribute<Categoria, String> estado;
    public static volatile SingularAttribute<Categoria, Date> fechaCreacion;
    public static volatile ListAttribute<Categoria, Productos> productosList;
    public static volatile SingularAttribute<Categoria, String> nombre;
    public static volatile SingularAttribute<Categoria, Integer> categoriaId;
    public static volatile ListAttribute<Categoria, Productos> productosList1;

}