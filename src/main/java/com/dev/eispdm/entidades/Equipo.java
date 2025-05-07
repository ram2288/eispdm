package com.dev.eispdm.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "equipos")
public class Equipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEquipo;
    private String nomEquipo;
    private String serie;
    private String Descripcion;
    private String Observacion;
    private LocalDateTime fechaCompra;
    private LocalDateTime fechaCreado;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_Categoria", nullable = false)
    private Categoria categoria;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_Aula", nullable = false)
    private Aula aula;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_Estado", nullable = false)
    private EstadoEquipo estadoEquipo;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_carrera", nullable = false)
    private Carrera carrera;
}
