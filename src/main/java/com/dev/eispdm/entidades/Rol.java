package com.dev.eispdm.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_rol")
    private Integer idRol;
    @Column(nullable = false, unique = true)
    private String Rol;

    /*@OneToMany(mappedBy = "estadoEquipo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Equipo> equipos;*/
}
