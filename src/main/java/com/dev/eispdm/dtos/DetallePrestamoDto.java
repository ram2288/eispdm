package com.dev.eispdm.dtos;

import com.dev.eispdm.entidades.Equipo;
import com.dev.eispdm.entidades.Prestamo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePrestamoDto {
    private Integer idDetallePrestamo;
    private EquipoDto equipo;
    private PrestamoDto prestamo;
}
