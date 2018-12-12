package ejb;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-11T19:05:01")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile SingularAttribute<Registro, Integer> entregaId;
    public static volatile SingularAttribute<Registro, Integer> customerId;
    public static volatile SingularAttribute<Registro, Integer> ordenCompra;
    public static volatile SingularAttribute<Registro, Date> fechaPrometida;
    public static volatile SingularAttribute<Registro, Date> fechaEntregado;
    public static volatile SingularAttribute<Registro, Character> status;

}