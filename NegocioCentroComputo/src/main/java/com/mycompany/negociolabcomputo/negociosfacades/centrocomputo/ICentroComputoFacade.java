package com.mycompany.negociolabcomputo.negociosfacades.centrocomputo;

import dtos.centrocomputo.CentroComputoAgregarDTO;
import dtos.centrocomputo.CentroComputoTablaDTO;
import dtos.computadora.ComputadoraTablaDTO;
import entidades.CentroComputoDominio;
import entidades.UnidadDominio;

import java.util.List;

public interface ICentroComputoFacade {
    //Agregar Excepciones

    List<CentroComputoTablaDTO> consultarCentros();

    List<CentroComputoTablaDTO> consultarCentrosUnidad(UnidadDominio unidad);

    List<ComputadoraTablaDTO> consultarComputadorasCentro(CentroComputoDominio centro);

    void guardarCentro(CentroComputoAgregarDTO centroComputoAgregarDTO);

    CentroComputoDominio obtenerCentroPorId(Long id);

}
