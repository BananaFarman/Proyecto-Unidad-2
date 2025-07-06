package entidades;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;
import javax.persistence.*;

/**
 * @author brand
 */
@Entity
public class CentroComputoDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Time horaInicio;

    @Column(nullable = false)
    private Time horaFin;

    @Column(nullable = false, length = 50)
    private String usuarioAdmin;

    @Column(nullable = false, length = 255)
    private String contrasenaAdmin;

    @ManyToOne
    @JoinColumn(name = "id_unidad", nullable = false)
    private UnidadDominio unidad;

    @OneToMany(mappedBy = "centroComputo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ComputadoraDominio> computadoras;


    public CentroComputoDominio() {
    }

    public CentroComputoDominio(Time horaInicio, Time horaFin, String usuarioAdmin, String contrasenaAdmin, UnidadDominio unidad, List<ComputadoraDominio> computadoras) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.usuarioAdmin = usuarioAdmin;
        this.contrasenaAdmin = contrasenaAdmin;
        this.unidad = unidad;
        this.computadoras = computadoras;
    }

    public CentroComputoDominio(Long id, Time horaInicio, Time horaFin, String usuarioAdmin, String contrasenaAdmin, UnidadDominio unidad, List<ComputadoraDominio> computadoras) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.usuarioAdmin = usuarioAdmin;
        this.contrasenaAdmin = contrasenaAdmin;
        this.unidad = unidad;
        this.computadoras = computadoras;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
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

    public UnidadDominio getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDominio unidad) {
        this.unidad = unidad;
    }

    public List<ComputadoraDominio> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(List<ComputadoraDominio> computadoras) {
        this.computadoras = computadoras;
    }

    @Transient
    public int getNumeroComputadoras() {
        return computadoras != null ? computadoras.size() : 0;
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
        if (!(object instanceof CentroComputoDominio)) {
            return false;
        }
        CentroComputoDominio other = (CentroComputoDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CentroComputoDominio{" +
                "id=" + id +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", usuarioAdmin=" + usuarioAdmin +
                ", contrasenaAdmin=" + contrasenaAdmin +
                ", unidad=" + unidad +
                ", numeroComputadoras=" + getNumeroComputadoras() +
                '}';
    }

}
