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
//@Builder
@Entity
@Table(name = "estado_equipos")
public class EstadoEquipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstado;
    @Column(nullable = false, unique = true)
    private String estado;
    @OneToMany(mappedBy = "estadoEquipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Equipo> equipos;
}
