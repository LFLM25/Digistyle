package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Clientes;
import com.mycompany.proyectodi.entidades.DetalleVentas;
import com.mycompany.proyectodi.entidades.Servicios;
import com.mycompany.proyectodi.entidades.Usuarios;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Date> fecha;
    public static volatile SingularAttribute<Ventas, BigDecimal> total;
    public static volatile SingularAttribute<Ventas, String> estado;
    public static volatile ListAttribute<Ventas, DetalleVentas> detalleVentasList;
    public static volatile SingularAttribute<Ventas, BigDecimal> impuesto;
    public static volatile SingularAttribute<Ventas, Clientes> clienteId;
    public static volatile SingularAttribute<Ventas, Servicios> servicioId;
    public static volatile SingularAttribute<Ventas, String> nDocumento;
    public static volatile SingularAttribute<Ventas, Date> fechaCreacion;
    public static volatile SingularAttribute<Ventas, Integer> ventaId;
    public static volatile SingularAttribute<Ventas, Usuarios> usuarioId;

}