
package com.ista.prueba.pablosumba14.Service;

import com.ista.prueba.pablosumba14.Entity.Docente;
import com.ista.prueba.pablosumba14.Repository.DocenteRepository;
import net.bytebuddy.implementation.Implementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


/**
 *
 * @author Pablo
 */
@Service
public class DocenteServicioImpl extends GenericServiceImpl<Docente, Integer> implements DocenteService{
    @Autowired
    DocenteRepository docenteRepository;
    
    public CrudRepository<Docente, Integer> getDao() {
        return docenteRepository;
    }
}
