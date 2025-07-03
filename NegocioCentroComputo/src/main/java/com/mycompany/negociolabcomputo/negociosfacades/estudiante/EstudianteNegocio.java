package com.mycompany.negociolabcomputo.negociosfacades.estudiante;

import com.mycompany.persistencialabcomputo.daos.estudiante.EstudianteDAO;
import com.mycompany.persistencialabcomputo.daos.estudiante.IEstudianteDAO;

public class EstudianteNegocio implements IEstudianteNegocio {
    public IEstudianteDAO estudianteDAO;

    public EstudianteNegocio(IEstudianteDAO dao){
        estudianteDAO = dao;
    }
}
