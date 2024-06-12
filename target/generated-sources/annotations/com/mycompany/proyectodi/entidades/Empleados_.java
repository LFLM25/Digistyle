package com.mycompany.proyectodi.entidades;

import com.mycompany.proyectodi.entidades.Citas;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-06-11T20:16:54")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, String> estado;
    public static volatile SingularAttribute<Empleados, Integer> empleadoId;
    public static volatile SingularAttribute<Empleados, BigDecimal> salario;
    public static volatile SingularAttribute<Empleados, String> apellido;
    public static volatile SingularAttribute<Empleados, Date> fechaContratacion;
    public static volatile SingularAttribute<Empleados, String> direccion;
    public static volatile SingularAttribute<Empleados, Date> fechaCreacion;
    public static volatile SingularAttribute<Empleados, String> cargo;
    public static volatile SingularAttribute<Empleados, String> telefono;
    public static volatile SingularAttribute<Empleados, String> nombre;
    public static volatile ListAttribute<Empleados, Citas> citasList;
    public static volatile SingularAttribute<Empleados, String> email;

}