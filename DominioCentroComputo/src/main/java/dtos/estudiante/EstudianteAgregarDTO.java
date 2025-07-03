package dtos.estudiante;

/**
 *
 * @author brand
 */
public class EstudianteAgregarDTO {

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String contrasena;
    private Long idCarrera;

    public EstudianteAgregarDTO(String nombres, String apellidoPaterno, String apellidoMaterno, String contrasena, Long idCarrera) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contrasena = contrasena;
        this.idCarrera = idCarrera;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Long getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Long idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Override
    public String toString() {
        return "EstudianteAgregarDTO{" + "nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", contrasena=" + contrasena + ", idCarrera=" + idCarrera + '}';
    }

}
