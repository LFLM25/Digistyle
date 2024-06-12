package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Clientes;
import com.mycompany.proyectodi.entidades.Empleados;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Citas.class)
public class Citas_ { 

    public static volatile SingularAttribute<Citas, String> estado;
    public static volatile SingularAttribute<Citas, Integer> citaId;
    public static volatile SingularAttribute<Citas, String> estadoCita;
    public static volatile SingularAttribute<Citas, Clientes> clienteId;
    public static volatile SingularAttribute<Citas, Date> fechaHora;
    public static volatile SingularAttribute<Citas, Empleados> empleadoId;
    public static volatile SingularAttribute<Citas, Date> fechaCreacion;

}