package entidades;

import enums.EstatusBloqueo;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

/**
 *
 * @author brand
 */
@Entity
public class BloqueoDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime fechaInicio;

    private LocalDateTime fechaFin;

    @Column(nullable = false, length = 255)
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "id_estudiante", nullable = false)
    private EstudianteDominio estudiante;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstatusBloqueo estatusBloqueo;

    public BloqueoDominio() {
    }

    public BloqueoDominio(LocalDateTime fechaInicio, LocalDateTime fechaFin, String motivo, EstudianteDominio estudiante, EstatusBloqueo estatusBloqueo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.motivo = motivo;
        this.estudiante = estudiante;
        this.estatusBloqueo = estatusBloqueo;
    }

    public BloqueoDominio(Long id, LocalDateTime fechaInicio, LocalDateTime fechaFin, String motivo, EstudianteDominio estudiante, EstatusBloqueo estatusBloqueo) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.motivo = motivo;
        this.estudiante = estudiante;
        this.estatusBloqueo = estatusBloqueo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstudianteDominio getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteDominio estudiante) {
        this.estudiante = estudiante;
    }

    public EstatusBloqueo getEstatusBloqueo() {
        return estatusBloqueo;
    }

    public void setEstatusBloqueo(EstatusBloqueo estatusBloqueo) {
        this.estatusBloqueo = estatusBloqueo;
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
        if (!(object instanceof BloqueoDominio)) {
            return false;
        }
        BloqueoDominio other = (BloqueoDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BloqueoDominio{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", motivo=" + motivo + ", estudiante=" + estudiante + ", estatusBloqueo=" + estatusBloqueo + '}';
    }

}
