package com.mycompany.negociolabcomputo.negociosfacades.centrocomputo;

import com.mycompany.persistencialabcomputo.daos.centrocomputo.ICentroComputoDAO;
import dtos.centrocomputo.CentroComputoAgregarDTO;
import dtos.centrocomputo.CentroComputoTablaDTO;
import entidades.CentroComputoDominio;
import entidades.UnidadDominio;

import java.util.List;

public class CentroComputoFacade implements ICentroComputoFacade {
    private ICentroComputoNeogcio ICentroComputoNegocio;
    private ICentroComputoDAO centroComputoDAO;

    public CentroComputoFacade(ICentroComputoDAO dao) {
        centroComputoDAO = dao;
        this.ICentroComputoNegocio = new CentroComputoNegocio(centroComputoDAO);
    }

    @Override
    public List<CentroComputoTablaDTO> consultarCentros() {
        return ICentroComputoNegocio.consultarCentros();
    }

    @Override
    public List<CentroComputoTablaDTO> consultarCentrosUnidad(UnidadDominio unidad) {
        return ICentroComputoNegocio.consultarCentrosUnidad(unidad);
    }

    @Override
    public void guardarCentro(CentroComputoAgregarDTO centroComputoAgregarDTO) {
        ICentroComputoNegocio.guardarCentro(centroComputoAgregarDTO);
    }

}
