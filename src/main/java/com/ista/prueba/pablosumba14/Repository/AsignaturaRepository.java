/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ista.prueba.pablosumba14.Repository;

import com.ista.prueba.pablosumba14.Entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Pablo
 */
public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer>{
    @Query(value = "Select from asignatura a from where d.id_asignatura = :id_asignatura", nativeQuery = true)
    public Asignatura buscardocente(String id_asignatura);

    public Asignatura buscarAsignatura(String id_cedula);
}
