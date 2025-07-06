package com.mycompany.negociolabcomputo.negociosfacades;

import com.mycompany.negociolabcomputo.negociosfacades.apartado.IApartadoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.bloqueo.IBloqueoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.carrera.ICarreraFacade;
import com.mycompany.negociolabcomputo.negociosfacades.centrocomputo.ICentroComputoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.computadora.IComputadoraFacade;
import com.mycompany.negociolabcomputo.negociosfacades.estudiante.IEstudianteFacade;
import com.mycompany.negociolabcomputo.negociosfacades.unidadacademica.IUnidadAcademicaFacade;

public class SistemaFacade implements ISistemaFacade {
    private IUnidadAcademicaFacade unidadAcademicaFacade;
    private ICarreraFacade carreraFacade;
    private ICentroComputoFacade centroComputoFacade;
    private IComputadoraFacade computadoraFacade;
    private IEstudianteFacade estudianteFacade;
    private IApartadoFacade apartadoFacade;
    private IBloqueoFacade bloqueoFacade;

    public SistemaFacade(IUnidadAcademicaFacade unidadAcademicaFacade,
                         ICarreraFacade carreraFacade,
                         ICentroComputoFacade centroComputoFacade,
                         IComputadoraFacade computadoraFacade,
                         IEstudianteFacade estudianteFacade,
                         IApartadoFacade apartadoFacade,
                         IBloqueoFacade bloqueoFacade) {
        this.unidadAcademicaFacade = unidadAcademicaFacade;
        this.centroComputoFacade = centroComputoFacade;
        this.computadoraFacade = computadoraFacade;
        this.carreraFacade = carreraFacade;
        this.estudianteFacade = estudianteFacade;
        this.apartadoFacade = apartadoFacade;
        this.bloqueoFacade = bloqueoFacade;

    }

    public IUnidadAcademicaFacade getUnidadAcademicaFacade() {
        return unidadAcademicaFacade;
    }

    public ICarreraFacade getCarreraFacade() {
        return carreraFacade;
    }

    public ICentroComputoFacade getCentroComputoFacade() {
        return centroComputoFacade;
    }

    public IComputadoraFacade getComputadoraFacade() {
        return computadoraFacade;
    }

    public IEstudianteFacade getEstudianteFacade() {
        return estudianteFacade;
    }

    public IBloqueoFacade getBloqueoFacade() {
        return bloqueoFacade;
    }

    public IApartadoFacade getApartadoFacade() {
        return apartadoFacade;
    }
}
