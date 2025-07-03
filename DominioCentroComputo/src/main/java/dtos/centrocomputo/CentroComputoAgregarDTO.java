package dtos.centrocomputo;

import entidades.UnidadDominio;

import java.time.LocalTime;

/**
 *
 * @author brand
 */
public class CentroComputoAgregarDTO {

    private String nombre;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private String usuarioAdmin;
    private String contrasenaAdmin;
    private int numComputadoras;
    private UnidadDominio idUnidad;

    public CentroComputoAgregarDTO(String nombre, LocalTime horaInicio, LocalTime horaFin, String usuarioAdmin, String contrasenaAdmin, UnidadDominio idUnidad) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.usuarioAdmin = usuarioAdmin;
        this.contrasenaAdmin = contrasenaAdmin;
        this.numComputadoras = 0;
        this.idUnidad = idUnidad;
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

    public String getUsuarioAdmin() {
        return usuarioAdmin;
    }

    public void setUsuarioAdmin(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    public String getContrasenaAdmin() {
        return contrasenaAdmin;
    }

    public void setContrasenaAdmin(String contrasenaAdmin) {
        this.contrasenaAdmin = contrasenaAdmin;
    }

    public int getNumComputadoras() {
        return numComputadoras;
    }

    public UnidadDominio getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(UnidadDominio idUnidad) {
        this.idUnidad = idUnidad;
    }

    @Override
    public String toString() {
        return "CentroComputoAgregarDTO{" + "nombre=" + nombre + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", usuarioAdmin=" + usuarioAdmin + ", contrasenaAdmin=" + contrasenaAdmin + ", idUnidad=" + idUnidad + '}';
    }

}
