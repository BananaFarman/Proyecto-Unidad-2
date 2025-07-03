package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author brand
 */
@Entity
public class CarreraDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal tiempoLimite;

    @ManyToOne
    @JoinColumn(name = "id_unidad", nullable = false)
    private UnidadDominio unidad;

    @OneToMany(mappedBy = "carrera")
    private List<EstudianteDominio> estudiantes;

    public CarreraDominio() {
    }

    public CarreraDominio(String nombre, BigDecimal tiempoLimite, UnidadDominio unidad) {
        this.nombre = nombre;
        this.tiempoLimite = tiempoLimite;
        this.unidad = unidad;
        this.estudiantes = null;
    }

    public CarreraDominio(Long id, String nombre, BigDecimal tiempoLimite, UnidadDominio unidad) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoLimite = tiempoLimite;
        this.unidad = unidad;
        this.estudiantes = null;
    }

    public CarreraDominio(String nombre, BigDecimal tiempoLimite, UnidadDominio unidad, List<EstudianteDominio> estudiantes) {
        this.nombre = nombre;
        this.tiempoLimite = tiempoLimite;
        this.unidad = unidad;
        this.estudiantes = estudiantes;
    }

    public CarreraDominio(Long id, String nombre, BigDecimal tiempoLimite, UnidadDominio unidad, List<EstudianteDominio> estudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoLimite = tiempoLimite;
        this.unidad = unidad;
        this.estudiantes = estudiantes;
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

    public BigDecimal getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(BigDecimal tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }

    public UnidadDominio getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDominio unidad) {
        this.unidad = unidad;
    }

    public List<EstudianteDominio> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<EstudianteDominio> estudiantes) {
        this.estudiantes = estudiantes;
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
        if (!(object instanceof CarreraDominio)) {
            return false;
        }
        CarreraDominio other = (CarreraDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CarreraDominio{" + "id=" + id + ", nombre=" + nombre + ", tiempoLimite=" + tiempoLimite + ", unidad=" + unidad + ", estudiantes=" + estudiantes + '}';
    }

}
