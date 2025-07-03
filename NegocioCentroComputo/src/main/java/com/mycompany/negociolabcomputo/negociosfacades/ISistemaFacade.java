package com.mycompany.negociolabcomputo.negociosfacades;

import com.mycompany.negociolabcomputo.negociosfacades.apartado.IApartadoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.bloqueo.IBloqueoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.carrera.ICarreraFacade;
import com.mycompany.negociolabcomputo.negociosfacades.centrocomputo.ICentroComputoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.estudiante.IEstudianteFacade;
import com.mycompany.negociolabcomputo.negociosfacades.unidadacademica.IUnidadAcademicaFacade;

public interface ISistemaFacade {

    IUnidadAcademicaFacade getUnidadAcademicaFacade();

    ICarreraFacade getCarreraFacade();

    ICentroComputoFacade getCentroComputoFacade();

    IEstudianteFacade getEstudianteFacade();

    IBloqueoFacade getBloqueoFacade();

    IApartadoFacade getApartadoFacade();
}
