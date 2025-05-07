package com.dev.eispdm.dtos;
import com.dev.eispdm.entidades.DetallePrestamo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListaNegraDto {

    private Integer id_listaNegra;
    private LocalDateTime fe_reportado;
    private String observaciones;
    private DetallePrestamo detallePrestamo;
}
