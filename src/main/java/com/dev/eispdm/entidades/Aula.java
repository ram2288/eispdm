package com.dev.eispdm.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "aulas")
public class Aula implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_aula")
    private Integer idAula;
    @Column(nullable = false, unique = true)
    private String aula;
   // @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_carrera", nullable = false)
    private Carrera carrera ;
    @JsonIgnore
    @OneToMany(mappedBy = "aula", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Equipo> equipos ;
}
