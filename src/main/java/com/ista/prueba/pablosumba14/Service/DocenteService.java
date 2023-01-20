/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ista.prueba.pablosumba14.Service;

import com.ista.prueba.pablosumba14.Entity.Docente;

/**
 *
 * @author Pablo
 */
public interface DocenteService extends GenericService<Docente, Integer>{

    public void delete(Integer id);

    public Docente findById(Integer id);
    
}
