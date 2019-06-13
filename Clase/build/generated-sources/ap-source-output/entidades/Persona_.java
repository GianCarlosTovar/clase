package entidades;

import entidades.Ciudad;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-10T17:45:06")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, Integer> apellido;
    public static volatile SingularAttribute<Persona, Integer> correo;
    public static volatile SingularAttribute<Persona, Integer> nombre;
    public static volatile SingularAttribute<Persona, Integer> idPersona;
    public static volatile SingularAttribute<Persona, Ciudad> idCiudad;

}