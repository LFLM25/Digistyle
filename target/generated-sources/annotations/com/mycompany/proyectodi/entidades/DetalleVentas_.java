package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Productos;
import com.mycompany.proyectodi.entidades.Ventas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(DetalleVentas.class)
public class DetalleVentas_ { 

    public static volatile SingularAttribute<DetalleVentas, Productos> productoId;
    public static volatile SingularAttribute<DetalleVentas, Ventas> ventaId;
    public static volatile SingularAttribute<DetalleVentas, Integer> cantidad;
    public static volatile SingularAttribute<DetalleVentas, BigDecimal> precioVenta;
    public static volatile SingularAttribute<DetalleVentas, Integer> detalleId;

}