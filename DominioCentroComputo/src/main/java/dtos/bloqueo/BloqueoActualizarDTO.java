package dtos.bloqueo;

import java.time.LocalDateTime;

/**
 *
 * @author brand
 */
public class BloqueoActualizarDTO {

    private Long id;
    private LocalDateTime fechaFin;

    public BloqueoActualizarDTO(Long id, LocalDateTime fechaFin) {
        this.id = id;
        this.fechaFin = fechaFin;
    }

    public BloqueoActualizarDTO(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "BloqueoActualizarDTO{" + "id=" + id + ", fechaFin=" + fechaFin + '}';
    }

}
