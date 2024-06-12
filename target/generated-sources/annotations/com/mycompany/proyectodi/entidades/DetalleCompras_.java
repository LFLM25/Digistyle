package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Compras;
import com.mycompany.proyectodi.entidades.Productos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(DetalleCompras.class)
public class DetalleCompras_ { 

    public static volatile SingularAttribute<DetalleCompras, Productos> productoId;
    public static volatile SingularAttribute<DetalleCompras, BigDecimal> precioCompra;
    public static volatile SingularAttribute<DetalleCompras, Integer> cantidad;
    public static volatile SingularAttribute<DetalleCompras, Integer> detalleId;
    public static volatile SingularAttribute<DetalleCompras, Compras> compraId;

}