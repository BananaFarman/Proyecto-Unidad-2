package dtos.centrocomputo;

import java.time.LocalTime;

/**
 *
 * @author brand
 */
public class CentroComputoActualizarDTO {

    private Long id;
    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public CentroComputoActualizarDTO(Long id, String nombre, LocalTime horaInicio, LocalTime horaFin) {
        this.id = id;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "CentroComputoActualizarDTO{" + "id=" + id + ", nombre=" + nombre + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + '}';
    }

}
