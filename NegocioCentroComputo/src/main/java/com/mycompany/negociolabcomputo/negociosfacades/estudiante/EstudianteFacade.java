package com.mycompany.negociolabcomputo.negociosfacades.estudiante;

import com.mycompany.persistencialabcomputo.daos.estudiante.EstudianteDAO;
import com.mycompany.persistencialabcomputo.daos.estudiante.IEstudianteDAO;

public class EstudianteFacade implements IEstudianteFacade {
    IEstudianteNegocio IEstudianteNegocio;
    IEstudianteDAO IEstudianteDAO;

    public EstudianteFacade(IEstudianteDAO dao) {
        this.IEstudianteDAO = dao;
        this.IEstudianteNegocio = new EstudianteNegocio(IEstudianteDAO);
    }
}
