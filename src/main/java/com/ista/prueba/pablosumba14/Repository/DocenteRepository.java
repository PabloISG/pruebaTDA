
package com.ista.prueba.pablosumba14.Repository;

import com.ista.prueba.pablosumba14.Entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Pablo
 */
public interface DocenteRepository extends JpaRepository<Docente, Integer>{
    @Query(value = "Select from docente d from where d.id_docente = :docente", nativeQuery = true)
    public Docente buscardocente(String id_docente);
}
