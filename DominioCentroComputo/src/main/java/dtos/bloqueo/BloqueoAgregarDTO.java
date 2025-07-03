package dtos.bloqueo;

/**
 *
 * @author brand
 */
public class BloqueoAgregarDTO {

    private String motivo;
    private Long idEstudiante;

    public BloqueoAgregarDTO(String motivo, Long idEstudiante) {
        this.motivo = motivo;
        this.idEstudiante = idEstudiante;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "BloqueoAgregarDTO{" + "motivo=" + motivo + ", idEstudiante=" + idEstudiante + '}';
    }

}
