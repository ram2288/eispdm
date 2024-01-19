package com.dev.eispdm.entidades;


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
@Table(name = "estudiantes")
public class Estudiante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiante;
    private  String nomEstudiante;
    private  String apePaterno;
    private String apeMaterno;
    private String ci;
    private String matricula;
    @ManyToOne
    @JoinColumn(name = "id_Carrera", nullable = false)
    private Carrera carrera;
    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Prestamo> prestamos;

}
