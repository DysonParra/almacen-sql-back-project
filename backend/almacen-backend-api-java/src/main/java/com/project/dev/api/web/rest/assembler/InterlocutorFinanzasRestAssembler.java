/*
 * @fileoverview    {InterlocutorFinanzasRestAssembler}
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
package com.project.dev.api.web.rest.assembler;

import com.project.dev.api.dto.InterlocutorFinanzasDTO;
import com.project.dev.api.web.rest.InterlocutorFinanzasRest;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * TODO: Definición de {@code InterlocutorFinanzasRestAssembler}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Component
public class InterlocutorFinanzasRestAssembler implements RepresentationModelAssembler<InterlocutorFinanzasDTO, EntityModel<InterlocutorFinanzasDTO>> {

    /**
     * Convierte un DTO en un modelo.
     *
     * @param entityDTO DTO a convertir.
     * @return el modelo correspondiente al DTO:
     */
    @Override
    public EntityModel<InterlocutorFinanzasDTO> toModel(InterlocutorFinanzasDTO entityDTO) {
        return new EntityModel<>(entityDTO,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(InterlocutorFinanzasRest.class).getEntity(String.valueOf(entityDTO.getIntIdInterlocutorFinanzas()))).withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(InterlocutorFinanzasRest.class).getAllEntities()).withRel("InterlocutorFinanzas"));
    }
}
