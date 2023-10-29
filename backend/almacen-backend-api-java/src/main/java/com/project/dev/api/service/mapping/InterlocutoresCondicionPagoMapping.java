/*
 * @fileoverview    {InterlocutoresCondicionPagoMapping}
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
package com.project.dev.api.service.mapping;

import com.project.dev.api.domain.InterlocutoresCondicionPago;
import com.project.dev.api.dto.InterlocutoresCondicionPagoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * TODO: Definición de {@code InterlocutoresCondicionPagoMapping}.
 *
 * @author Dyson Parra
 * @since 11
 */
@Mapper(componentModel = "spring") //, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface InterlocutoresCondicionPagoMapping extends GenericMapping<InterlocutoresCondicionPagoDTO, InterlocutoresCondicionPago> {

    /**
     * Obtiene una entidad en base a su DTO.
     *
     * @param dto es el DTO a convertir en entidad.
     * @return la entidad equivalente al dto.
     */
    // Deben ser el campo clave de la base de datos.
    @Mapping(source = "intIdInterlocutorCondicionPago", target = "intIdInterlocutorCondicionPago")
    @Override
    public InterlocutoresCondicionPago getEntity(InterlocutoresCondicionPagoDTO dto);

    /**
     * Obtiene un DTO en base a su entidad.
     *
     * @param entity es la entidad a convertir en DTO.
     * @return el dto equivalente a la entidad.
     */
    // Deben ser el campo clave de la base de datos.
    @Mapping(source = "intIdInterlocutorCondicionPago", target = "intIdInterlocutorCondicionPago")
    @Override
    public InterlocutoresCondicionPagoDTO getDto(InterlocutoresCondicionPago entity);

    /**
     * TODO: Definición de {@code withId}.
     *
     * @param strId
     * @return
     */
    public default InterlocutoresCondicionPago withId(String strId) {
        if (strId == null) {
            return null;
        }
        InterlocutoresCondicionPago entity = new InterlocutoresCondicionPago();
        entity.setIntIdInterlocutorCondicionPago(Long.parseLong(strId));
        return entity;
    }
}
