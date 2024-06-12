package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Compras;
import com.mycompany.proyectodi.entidades.Rol;
import com.mycompany.proyectodi.entidades.Servicios;
import com.mycompany.proyectodi.entidades.Ventas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, Rol> rolId;
    public static volatile ListAttribute<Usuarios, Servicios> serviciosList;
    public static volatile SingularAttribute<Usuarios, String> estado;
    public static volatile ListAttribute<Usuarios, Compras> comprasList;
    public static volatile SingularAttribute<Usuarios, String> apellido;
    public static volatile SingularAttribute<Usuarios, String> correo;
    public static volatile SingularAttribute<Usuarios, Date> fechaCreacion;
    public static volatile ListAttribute<Usuarios, Ventas> ventasList;
    public static volatile SingularAttribute<Usuarios, String> contrasena;
    public static volatile SingularAttribute<Usuarios, Integer> usuarioId;
    public static volatile SingularAttribute<Usuarios, String> nombre;

}