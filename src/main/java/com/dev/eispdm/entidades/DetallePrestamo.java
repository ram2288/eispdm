package com.dev.eispdm.entidades;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "detalle_prestamos")
public class DetallePrestamo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetallePrestamo;
    @ManyToOne
    @JoinColumn(name = "id_equipo", nullable = false)
    private Equipo equipo;
    @ManyToOne
    @JoinColumn(name = "id_prestamo", nullable = false)
    private Prestamo prestamo;
}
