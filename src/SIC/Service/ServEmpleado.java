package SIC.Service;

import SIC.Entidades.Empleado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author GALICIA
 */
public class ServEmpleado extends BasicService{

    public ServEmpleado(String persistenceUnit) {
        super(persistenceUnit);
    }


    public List<Empleado> getListado() {
        Query q = getEntityManager().createNamedQuery("Empleado.findAll");
        return q.getResultList();
    }
    
}
