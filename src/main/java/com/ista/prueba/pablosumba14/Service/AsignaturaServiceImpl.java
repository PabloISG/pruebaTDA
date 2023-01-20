/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ista.prueba.pablosumba14.Service;

import com.ista.prueba.pablosumba14.Entity.Asignatura;
import com.ista.prueba.pablosumba14.Repository.AsignaturaRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pablo
 */
@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura, Serializable>{

    /**
     *
     * @return
     */
    @Override
    public CrudRepository<Asignatura, Serializable> getDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Autowired
    AsignaturaRepository asignaturaRepository;

    @Override
    public CrudRepository<Asignatura, Integer> getDao() {
        return asignaturaRepository;
    }

    public Asignatura buscarAsignatura(String id_cedula) {
        return asignaturaRepository.buscarAsignatura(id_cedula);
    }
    
}
