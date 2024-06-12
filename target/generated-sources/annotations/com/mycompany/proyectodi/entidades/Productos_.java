package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Categoria;
import com.mycompany.proyectodi.entidades.DetalleCompras;
import com.mycompany.proyectodi.entidades.DetalleVentas;
import com.mycompany.proyectodi.entidades.Inventarios;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Inventarios> inventarioId;
    public static volatile SingularAttribute<Productos, String> estado;
    public static volatile SingularAttribute<Productos, Integer> productoId;
    public static volatile SingularAttribute<Productos, String> imagen;
    public static volatile SingularAttribute<Productos, String> nombre;
    public static volatile SingularAttribute<Productos, Categoria> categoriaId;
    public static volatile ListAttribute<Productos, DetalleVentas> detalleVentasList;
    public static volatile SingularAttribute<Productos, Integer> stockMin;
    public static volatile SingularAttribute<Productos, Short> llevaImpuesto;
    public static volatile ListAttribute<Productos, DetalleCompras> detalleComprasList;
    public static volatile SingularAttribute<Productos, BigDecimal> precioCompra;
    public static volatile SingularAttribute<Productos, Date> fechaCreacion;
    public static volatile SingularAttribute<Productos, BigDecimal> precioVenta;
    public static volatile SingularAttribute<Productos, Integer> stock;
    public static volatile SingularAttribute<Productos, String> codigoBarras;
    public static volatile ListAttribute<Productos, Categoria> categoriaList;

}