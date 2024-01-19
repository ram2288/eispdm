package com.dev.eispdm.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "docentes")
public class Docente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocente;
    private String nomDocente;
    private String apePaterno;
    private String apeMaterno;
    private String ci;
    @ManyToOne
    @JoinColumn(name = "id_carrera", nullable = false)
    private Carrera carrera;
    @OneToMany(mappedBy = "docente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Prestamo> prestamos;
}
