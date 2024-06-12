package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Compras;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(TipoDocumentos.class)
public class TipoDocumentos_ { 

    public static volatile SingularAttribute<TipoDocumentos, String> estado;
    public static volatile ListAttribute<TipoDocumentos, Compras> comprasList;
    public static volatile SingularAttribute<TipoDocumentos, Date> fechaCreacion;
    public static volatile SingularAttribute<TipoDocumentos, Integer> documentoId;
    public static volatile SingularAttribute<TipoDocumentos, String> nombre;

}