package com.mycompany.negociolabcomputo.negociosfacades.apartado;

import com.mycompany.negociolabcomputo.negociosfacades.centrocomputo.CentroComputoNegocio;
import com.mycompany.persistencialabcomputo.daos.apartado.ApartadoDAO;
import com.mycompany.persistencialabcomputo.daos.apartado.IApartadoDAO;
import com.mycompany.persistencialabcomputo.daos.centrocomputo.ICentroComputoDAO;

public class ApartadoFacade implements IApartadoFacade {
    private IApartadoNegocio IApartadoNegocio;
    private IApartadoDAO apartadoDAO;

    public ApartadoFacade(IApartadoDAO dao) {
        this.apartadoDAO = dao;
        this.IApartadoNegocio = new ApartadoNegocio(apartadoDAO);
    }

    //Llamadas a ApartadoNegocio

}
