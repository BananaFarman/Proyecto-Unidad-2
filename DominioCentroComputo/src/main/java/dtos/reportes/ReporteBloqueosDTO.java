package dtos.reportes;

import java.time.LocalDate;

/**
 *
 * @author brand
 */
public class ReporteBloqueosDTO {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ReporteBloqueosDTO(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
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
        return "ReporteBloqueosDTO{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

}
