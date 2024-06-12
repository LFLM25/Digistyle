package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.DetalleCompras;
import com.mycompany.proyectodi.entidades.Proveedores;
import com.mycompany.proyectodi.entidades.TipoDocumentos;
import com.mycompany.proyectodi.entidades.Usuarios;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Compras.class)
public class Compras_ { 

    public static volatile SingularAttribute<Compras, Date> fecha;
    public static volatile SingularAttribute<Compras, BigDecimal> total;
    public static volatile SingularAttribute<Compras, String> estado;
    public static volatile SingularAttribute<Compras, BigDecimal> impuesto;
    public static volatile SingularAttribute<Compras, Proveedores> proveedorId;
    public static volatile ListAttribute<Compras, DetalleCompras> detalleComprasList;
    public static volatile SingularAttribute<Compras, String> nDocumento;
    public static volatile SingularAttribute<Compras, Date> fechaCreacion;
    public static volatile SingularAttribute<Compras, TipoDocumentos> documentoId;
    public static volatile SingularAttribute<Compras, Usuarios> usuarioId;
    public static volatile SingularAttribute<Compras, Integer> compraId;

}