package com.dev.eispdm.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lista_negra")
public class ListaNegra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_listaNegra;
    private LocalDateTime fe_reportado;
    private String observaciones;
    @ManyToOne
    @JoinColumn(name = "idDetallePrestamo", nullable = false)
    private DetallePrestamo detallePrestamo;
}
