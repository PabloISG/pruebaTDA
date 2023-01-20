
package com.ista.prueba.pablosumba14.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Pablo
 */
@Getter
@Setter
@Entity
public class Docente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_docente")
    private int idDocente;
    @Column(name = "nombre_docente")
    private String nombreDocente;
    @Column(name = "apellido_docente")
    private String apellido;
    @Column(name = "celular_docente")
    private String celular;
    @Column(name = "email_docente")
    private String email;
    
    @JsonIgnore
    @OneToMany(mappedBy = "docente")
    private List<Asignatura> asignaturas;
}
