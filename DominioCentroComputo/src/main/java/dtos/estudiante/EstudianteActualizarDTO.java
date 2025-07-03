package dtos.estudiante;

import enums.EstatusInscripcion;

/**
 *
 * @author brand
 */
public class EstudianteActualizarDTO {

    private Long id;
    private EstatusInscripcion estatusInscripcion;

    public EstudianteActualizarDTO(Long id, EstatusInscripcion estatusInscripcion) {
        this.id = id;
        this.estatusInscripcion = estatusInscripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstatusInscripcion getEstatusInscripcion() {
        return estatusInscripcion;
    }

    public void setEstatusInscripcion(EstatusInscripcion estatusInscripcion) {
        this.estatusInscripcion = estatusInscripcion;
    }

    @Override
    public String toString() {
        return "EstudianteActualizarDTO{" + "id=" + id + ", estatusInscripcion=" + estatusInscripcion + '}';
    }

}
