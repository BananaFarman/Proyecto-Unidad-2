package com.mycompany.presentacionlabcomputo.main;

import com.mycompany.negociolabcomputo.negociosfacades.ISistemaFacade;
import com.mycompany.negociolabcomputo.negociosfacades.SistemaFacade;
import com.mycompany.negociolabcomputo.negociosfacades.apartado.ApartadoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.apartado.IApartadoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.bloqueo.BloqueoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.bloqueo.IBloqueoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.carrera.CarreraFacade;
import com.mycompany.negociolabcomputo.negociosfacades.carrera.ICarreraFacade;
import com.mycompany.negociolabcomputo.negociosfacades.centrocomputo.CentroComputoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.centrocomputo.ICentroComputoFacade;
import com.mycompany.negociolabcomputo.negociosfacades.computadora.ComputadoraFacade;
import com.mycompany.negociolabcomputo.negociosfacades.computadora.IComputadoraFacade;
import com.mycompany.negociolabcomputo.negociosfacades.estudiante.EstudianteFacade;
import com.mycompany.negociolabcomputo.negociosfacades.estudiante.IEstudianteFacade;
import com.mycompany.negociolabcomputo.negociosfacades.unidadacademica.IUnidadAcademicaFacade;
import com.mycompany.negociolabcomputo.negociosfacades.unidadacademica.UnidadAcademicaFacade;
import com.mycompany.persistencialabcomputo.conexion.EntityManagerProvider;
import com.mycompany.persistencialabcomputo.daos.apartado.ApartadoDAO;
import com.mycompany.persistencialabcomputo.daos.bloqueo.BloqueoDAO;
import com.mycompany.persistencialabcomputo.daos.carrera.CarreraDAO;
import com.mycompany.persistencialabcomputo.daos.centrocomputo.CentroComputoDAO;
import com.mycompany.persistencialabcomputo.daos.computadora.ComputadoraDAO;
import com.mycompany.persistencialabcomputo.daos.estudiante.EstudianteDAO;
import com.mycompany.persistencialabcomputo.daos.unidadacademica.UnidadAcademicaDAO;
import com.mycompany.presentacionlabcomputo.frames.MainFrameBase;
import com.mycompany.presentacionlabcomputo.frames.ReservarEquipoFrame;
import dtos.unidadacademica.InsertarUnidadesDTO;
import entidades.UnidadDominio;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class PresentacionMain {
//    private static EntityManager em;

    public static void main(String[] args) {
        ISistemaFacade sistemaFacade = loader();
        //Guardad unidades educativas automaticamente
        if (sistemaFacade.getUnidadAcademicaFacade().obtenerTodos().isEmpty()) {
            List<UnidadDominio> unidadesAcademicas = new ArrayList<>();
            UnidadDominio unidad1 = new UnidadDominio("Nainari");
            UnidadDominio unidad2 = new UnidadDominio("Centro");
            UnidadDominio unidad3 = new UnidadDominio("Navojoa");
            unidadesAcademicas.add(unidad1);
            unidadesAcademicas.add(unidad2);
            unidadesAcademicas.add(unidad3);
            InsertarUnidadesDTO insertarUnidadesDTO = new InsertarUnidadesDTO(unidadesAcademicas);
            sistemaFacade.getUnidadAcademicaFacade().insertarUnidadesAcademias(insertarUnidadesDTO);

        }
        MainFrameBase mainFrame = new MainFrameBase(sistemaFacade);
//        sistemaFacade.getUnidadAcademicaFacade().vaciar();

        //Verificacion Login
        //LogInFrame inicio = new LogInFrame();
//        IComputadoraDAO computadoraDAO = new ComputadoraDAO(EntityManagerProvider.getEntityManager());
//        AccesoSistemaService accesoService = new AccesoSistemaService(computadoraDAO);
//
//        //Verificar si la ip del equipo existe en la base de datos de equipos permitidos
//        if (accesoService.ipEsValida()) {
//            SwingUtilities.invokeLater(LogInFrame::new);
//        } else {
//            JOptionPane.showMessageDialog(null, "Acceso denegado: IP no autorizada.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.exit(0);
//        }

        //Prueba para cada frame
//      ReservarEquipoFrame reservarEquipoFrame = new ReservarEquipoFrame();
//      ICentroComputoDAO centroComputoDAO = new CentroComputoDAO(EntityManagerProvider.getEntityManager());
//      ICentroComputoFacade centroComputoFacade = new CentroComputoFacade(centroComputoDAO);
//      MainFrameBase mainFrame = new MainFrameBase(centroComputoFacade);

    }

    public static ISistemaFacade loader() {
        //Entity Manager para las DAO´s
        EntityManager em = EntityManagerProvider.getEntityManager();

        //DAO´s
        UnidadAcademicaDAO unidadAcademicaDAO = new UnidadAcademicaDAO(em);
        CarreraDAO carreraDAO = new CarreraDAO(em);
        CentroComputoDAO centroComputoDAO = new CentroComputoDAO(em);
        ComputadoraDAO computadoraDAO = new ComputadoraDAO(em);
        EstudianteDAO estudianteDAO  = new EstudianteDAO(em);
        ApartadoDAO apartadoDAO = new ApartadoDAO(em);
        BloqueoDAO bloqueoDAO = new BloqueoDAO(em);

        // Fachadas individuales que se cargan a la fechada principal
        IUnidadAcademicaFacade unidadAcademicaFacade = new UnidadAcademicaFacade(unidadAcademicaDAO);
        ICarreraFacade  carreraFacade = new CarreraFacade(carreraDAO);
        ICentroComputoFacade centroComputoFacade = new CentroComputoFacade(centroComputoDAO);
        IComputadoraFacade computadoraFacade = new ComputadoraFacade(computadoraDAO);
        IEstudianteFacade estudianteFacade = new EstudianteFacade(estudianteDAO);
        IApartadoFacade  apartadoFacade = new ApartadoFacade(apartadoDAO);
        IBloqueoFacade bloqueoFacade = new BloqueoFacade(bloqueoDAO);

        return new SistemaFacade(unidadAcademicaFacade,
                carreraFacade,
                centroComputoFacade,
                computadoraFacade,
                estudianteFacade,
                apartadoFacade,
                bloqueoFacade);
    }


}
