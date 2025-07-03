package com.mycompany.negociolabcomputo.negociosfacades.carrera;

import com.mycompany.persistencialabcomputo.daos.bloqueo.IBloqueoDAO;
import com.mycompany.persistencialabcomputo.daos.carrera.ICarreraDAO;

public class CarreraNegocio implements ICarreraNegocio{
    private ICarreraDAO carreraDAO;

    public CarreraNegocio(ICarreraDAO carreraDAO) {
        this.carreraDAO = carreraDAO;
    }

    //Acciones de carrera

}
