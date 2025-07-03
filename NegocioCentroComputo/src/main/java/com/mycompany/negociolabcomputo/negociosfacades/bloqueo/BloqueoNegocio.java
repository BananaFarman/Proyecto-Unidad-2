package com.mycompany.negociolabcomputo.negociosfacades.bloqueo;

import com.mycompany.persistencialabcomputo.daos.bloqueo.BloqueoDAO;
import com.mycompany.persistencialabcomputo.daos.bloqueo.IBloqueoDAO;

public class BloqueoNegocio implements IBloqueoNegocio {
    private IBloqueoDAO bloqueoDAO;

    public BloqueoNegocio(IBloqueoDAO bloqueoDAO) {
        this.bloqueoDAO = bloqueoDAO;
    }

    //Acciones de bloqueo
}
