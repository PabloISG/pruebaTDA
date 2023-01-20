/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ista.prueba.pablosumba14.Controller;

import com.ista.prueba.pablosumba14.Entity.Asignatura;
import com.ista.prueba.pablosumba14.Service.AsignaturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pablo
 */
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/Asignatura")
public class AsignaturaController {
    
    @Autowired
    AsignaturaService asignaturaService;
    

    @GetMapping("/listarA")
    public ResponseEntity< List<Asignatura>> obtenerLista() {
        return new ResponseEntity<>(asignaturaService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crearA")
    public ResponseEntity<Asignatura> crear(@RequestBody Asignatura a){
     return new ResponseEntity<>(asignaturaService.save(a), HttpStatus.CREATED);
    }
    
      @DeleteMapping("/eliminarA/{id}")
    public ResponseEntity<Asignatura> eliminar(@PathVariable Integer id) {
        asignaturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizarA/{id}")
    public ResponseEntity<Asignatura> actualizarUsuario(@PathVariable Integer id, @RequestBody Asignatura a) {
        Asignatura asignatura = asignaturaService.findById(id);
        if (asignatura == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                asignatura.setCarrera(a.getCarrera());
                asignatura.setNombreAsignatura(a.getNombreAsignatura());
                asignatura.setHoraInicio(a.getHoraInicio());
                asignatura.setHoraFin(a.getHoraFin());
                
                return new ResponseEntity<>(asignaturaService.save(asignatura), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

    }
    
}
