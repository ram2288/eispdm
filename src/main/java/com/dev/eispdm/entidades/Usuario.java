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
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nomUsuario;
    private String apePaterno;
    private String apeMaterno;
    private String ci;
    private String usuario;
    private String pass;
    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;
    @ManyToOne
    @JoinColumn(name = "id_carrera", nullable = false)
    private Carrera carrera;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Prestamo> prestamos;

}
