package dtos.reportes;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author brand
 */
public class ReporteCarrerasDTO {

    private List<Long> idsCarreras;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ReporteCarrerasDTO(List<Long> idsCarreras, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idsCarreras = idsCarreras;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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

    @Override
    public String toString() {
        return "ReporteCarrerasDTO{" + "idsCarreras=" + idsCarreras + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

}
