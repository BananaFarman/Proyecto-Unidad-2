package com.mycompany.negociolabcomputo.negociosfacades.carrera;

import com.mycompany.negociolabcomputo.negociosfacades.apartado.ApartadoNegocio;
import com.mycompany.persistencialabcomputo.daos.carrera.ICarreraDAO;

public class CarreraFacade implements ICarreraFacade{
    private ICarreraNegocio carreraNegocio;
    private ICarreraDAO carreraDAO;

    public CarreraFacade(ICarreraDAO carreraDAO) {
        this.carreraDAO = carreraDAO;
        this.carreraNegocio = new CarreraNegocio(carreraDAO);
    }
}
