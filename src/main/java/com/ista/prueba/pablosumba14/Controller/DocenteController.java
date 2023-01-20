
package com.ista.prueba.pablosumba14.Controller;

import com.ista.prueba.pablosumba14.Entity.Docente;
import com.ista.prueba.pablosumba14.Service.DocenteService;
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
@RequestMapping("/Docente")
public class DocenteController {
    
     @Autowired
    DocenteService docenteService;
    

    @GetMapping("/listarD")
    public ResponseEntity< List<Docente>> obtenerLista() {
        return new ResponseEntity<>(docenteService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crearD")
    public ResponseEntity<Docente> crear(@RequestBody Docente d){
     return new ResponseEntity<>(docenteService.save(d), HttpStatus.CREATED);
    }
    
      @DeleteMapping("/eliminarD/{id}")
    public ResponseEntity<Docente> eliminar(@PathVariable Integer id) {
        docenteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizarD/{id}")
    public ResponseEntity<Docente> actualizarUsuario(@PathVariable Integer id, @RequestBody Docente d) {
        Docente docente = docenteService.findById(id);
        if (docente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                docente.setNombreDocente(d.getNombreDocente());
                docente.setApellido(d.getApellido());
                docente.setEmail(d.getEmail());
                docente.setCelular(d.getCelular());
                
                return new ResponseEntity<>(docenteService.save(docente), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

    }
    
}
