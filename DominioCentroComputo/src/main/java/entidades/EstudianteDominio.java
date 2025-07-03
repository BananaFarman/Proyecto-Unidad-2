package entidades;

import enums.EstatusBloqueo;
import enums.EstatusInscripcion;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * @author brand
 */
@Entity
public class EstudianteDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombres;

    @Column(nullable = false, length = 50)
    private String apellidoPaterno;

    @Column(length = 50)
    private String apellidoMaterno;

    @Column(nullable = false, length = 255)
    private String contrasena;

    @ManyToOne
    @JoinColumn(name = "id_carrera", nullable = false)
    private CarreraDominio carrera;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstatusInscripcion estatusInscripcion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstatusBloqueo estatusBloqueo;

    @OneToMany(mappedBy = "estudiante")
    private List<BloqueoDominio> bloqueos;

    public EstudianteDominio() {
    }

    public EstudianteDominio(String nombres, String apellidoPaterno, String contrasena, CarreraDominio carrera, EstatusInscripcion estatusInscripcion, EstatusBloqueo estatusBloqueo) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = null;
        this.contrasena = contrasena;
        this.carrera = carrera;
        this.estatusInscripcion = estatusInscripcion;
        this.estatusBloqueo = estatusBloqueo;
        this.bloqueos = null;
    }

    public EstudianteDominio(Long id, String nombres, String apellidoPaterno, String contrasena, CarreraDominio carrera, EstatusInscripcion estatusInscripcion, EstatusBloqueo estatusBloqueo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = null;
        this.contrasena = contrasena;
        this.carrera = carrera;
        this.estatusInscripcion = estatusInscripcion;
        this.estatusBloqueo = estatusBloqueo;
        this.bloqueos = null;
    }

    public EstudianteDominio(String nombres, String apellidoPaterno, String apellidoMaterno, String contrasena, CarreraDominio carrera, EstatusInscripcion estatusInscripcion, EstatusBloqueo estatusBloqueo) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contrasena = contrasena;
        this.carrera = carrera;
        this.estatusInscripcion = estatusInscripcion;
        this.estatusBloqueo = estatusBloqueo;
        this.bloqueos = null;
    }

    public EstudianteDominio(Long id, String nombres, String apellidoPaterno, String apellidoMaterno, String contrasena, CarreraDominio carrera, EstatusInscripcion estatusInscripcion, EstatusBloqueo estatusBloqueo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.contrasena = contrasena;
        this.carrera = carrera;
        this.estatusInscripcion = estatusInscripcion;
        this.estatusBloqueo = estatusBloqueo;
        this.bloqueos = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public CarreraDominio getCarrera() {
        return carrera;
    }

    public void setCarrera(CarreraDominio carrera) {
        this.carrera = carrera;
    }

    public EstatusInscripcion getEstatusInscripcion() {
        return estatusInscripcion;
    }

    public void setEstatusInscripcion(EstatusInscripcion estatusInscripcion) {
        this.estatusInscripcion = estatusInscripcion;
    }

    public EstatusBloqueo getEstatusBloqueo() {
        return estatusBloqueo;
    }

    public void setEstatusBloqueo(EstatusBloqueo estatusBloqueo) {
        this.estatusBloqueo = estatusBloqueo;
    }

    public List<BloqueoDominio> getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(List<BloqueoDominio> bloqueos) {
        this.bloqueos = bloqueos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstudianteDominio)) {
            return false;
        }
        EstudianteDominio other = (EstudianteDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EstudianteDominio{" + "id=" + id + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", contrasena=" + contrasena + ", carrera=" + carrera + ", estatusInscripcion=" + estatusInscripcion + ", estatusBloqueo=" + estatusBloqueo + ", bloqueos=" + bloqueos + '}';
    }

}
