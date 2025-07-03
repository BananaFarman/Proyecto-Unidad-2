package dtos.carrera;

import java.math.BigDecimal;

/**
 *
 * @author brand
 */
public class CarreraAgregarDTO {

    private String nombre;
    private BigDecimal tiempoLimite;
    private Long idUnidad;

    public CarreraAgregarDTO(String nombre, BigDecimal tiempoLimite, Long idUnidad) {
        this.nombre = nombre;
        this.tiempoLimite = tiempoLimite;
        this.idUnidad = idUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(BigDecimal tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }

    public Long getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Long idUnidad) {
        this.idUnidad = idUnidad;
    }

    @Override
    public String toString() {
        return "CarreraAgregarDTO{" + "nombre=" + nombre + ", tiempoLimite=" + tiempoLimite + ", idUnidad=" + idUnidad + '}';
    }

}
