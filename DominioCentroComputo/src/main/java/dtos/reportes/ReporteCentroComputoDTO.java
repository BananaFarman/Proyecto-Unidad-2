package dtos.reportes;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author brand
 */
public class ReporteCentroComputoDTO {
    private Long idCentroComputo;
    private List<Long> idsCarreras;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ReporteCentroComputoDTO(Long idCentroComputo, List<Long> idsCarreras, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idCentroComputo = idCentroComputo;
        this.idsCarreras = idsCarreras;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getIdCentroComputo() {
        return idCentroComputo;
    }

    public void setIdCentroComputo(Long idCentroComputo) {
        this.idCentroComputo = idCentroComputo;
    }

    public List<Long> getIdsCarreras() {
        return idsCarreras;
    }

    public void setIdsCarreras(List<Long> idsCarreras) {
        this.idsCarreras = idsCarreras;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
