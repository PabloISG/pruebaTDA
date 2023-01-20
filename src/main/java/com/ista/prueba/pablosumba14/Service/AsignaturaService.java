
package com.ista.prueba.pablosumba14.Service;

import com.ista.prueba.pablosumba14.Entity.Asignatura;

/**
 *
 * @author Pablo
 */
public interface AsignaturaService  extends GenericService<Asignatura, Integer>{

    public void delete(Integer id);

    public Asignatura findById(Integer id);
    
}
