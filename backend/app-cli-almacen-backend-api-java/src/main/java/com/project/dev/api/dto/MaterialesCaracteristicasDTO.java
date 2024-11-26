/*
 * @fileoverview    {MaterialesCaracteristicasDTO}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Description of {@code MaterialesCaracteristicasDTO}.
 *
 * @author Dyson Parra
 * @since 11
 */
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class MaterialesCaracteristicasDTO {

    private Long intIdMaterialCaracteristica;
    private String strValorCaracteristica;
    private String strUsuario;
    private Date dtFecha;
    private String strCodigoMaterial;
    private Long intIdMaterial;
    private Long intIdTipoMaterialCaracteristica;
    private Long intIdTipoMaterial;

}