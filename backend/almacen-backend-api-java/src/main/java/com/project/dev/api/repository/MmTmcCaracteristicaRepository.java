/*
 * @fileoverview    {MmTmcCaracteristicaRepository}
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
package com.project.dev.api.repository;

import com.project.dev.api.domain.MmTmcCaracteristica;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * TODO: Definición de {@code MmTmcCaracteristicaRepository}.
 *
 * @author Dyson Parra
 * @since 11
 */
@org.springframework.stereotype.Repository
public interface MmTmcCaracteristicaRepository extends JpaRepository<MmTmcCaracteristica, Long> {

    /**
     * Busca en base de datos los registros que contengan una cadena específica.
     *
     * @param strSearch la cadena a buscar en base de datos.
     * @return los registros obtenidos.
     */
    // TODO: Especificar campo de la entidad donde realizar la búsqueda.
    @Query("SELECT m FROM MmTmcCaracteristica m WHERE m.intIdMmTmcCaracteristica LIKE CONCAT('%', :strSearch, '%')")
    public List<MmTmcCaracteristica> searchEntities(@Param("strSearch") String strSearch);

    /**
     * Busca en base de datos los registros que contengan una cadena específica.
     *
     * @param strSearch la cadena a buscar en base de datos.
     * @param pageable  indica la manera en que se paginarán los registros obtenidos.
     * @return los registros obtenidos.
     */
    // TODO: Especificar campo de la entidad donde realizar la búsqueda.
    @Query("SELECT m FROM MmTmcCaracteristica m WHERE m.intIdMmTmcCaracteristica LIKE CONCAT('%', :strSearch, '%')")
    public Page<MmTmcCaracteristica> searchEntities(@Param("strSearch") String strSearch, Pageable pageable);
}
