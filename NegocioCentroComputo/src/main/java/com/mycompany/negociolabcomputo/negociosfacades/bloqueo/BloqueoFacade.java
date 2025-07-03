package com.mycompany.negociolabcomputo.negociosfacades.bloqueo;

import com.mycompany.persistencialabcomputo.daos.bloqueo.IBloqueoDAO;

public class BloqueoFacade implements IBloqueoFacade {
    private IBloqueoNegocio bloqueoNegocio;
    private IBloqueoDAO bloqueoDAO;

    public BloqueoFacade(IBloqueoDAO bloqueoDAO) {
        this.bloqueoDAO = bloqueoDAO;
        this.bloqueoNegocio = new BloqueoNegocio(bloqueoDAO);

    }

    //Llamadas a BloqueoNegocio

}
