package entidades;

import enums.EstatusApartado;
import enums.FuncionEquipo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author brand
 */
@Entity
public class ComputadoraDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer numeroMaquina;

    @Column(nullable = false, length = 15, unique = true)
    private String direccionIp;

    @Column(length = 500)
    private List<String> softwareInstalado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstatusApartado estatusApartado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FuncionEquipo funcion;

    @ManyToOne
    @JoinColumn(name = "id_laboratorio", nullable = false)
    private CentroComputoDominio centroComputo;

    public ComputadoraDominio() {

    }

    public ComputadoraDominio(Integer numeroMaquina, String direccionIp, List<String> softwareInstalado, EstatusApartado estatusApartado, FuncionEquipo funcion, CentroComputoDominio centroComputo) {
        this.numeroMaquina = numeroMaquina;
        this.direccionIp = direccionIp;
        this.softwareInstalado = softwareInstalado;
        this.estatusApartado = estatusApartado;
        this.funcion = funcion;
        this.centroComputo = centroComputo;
    }

    public ComputadoraDominio(Long id, Integer numeroMaquina, String direccionIp, EstatusApartado estatusApartado, FuncionEquipo funcion, List<String> softwareInstalado, CentroComputoDominio centroComputo) {
        this.id = id;
        this.numeroMaquina = numeroMaquina;
        this.direccionIp = direccionIp;
        this.estatusApartado = estatusApartado;
        this.funcion = funcion;
        this.softwareInstalado = softwareInstalado;
        this.centroComputo = centroComputo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroMaquina() {
        return numeroMaquina;
    }

    public void setNumeroMaquina(Integer numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }

    public List<String> getSoftwareInstalado() {
        return softwareInstalado;
    }

    public void setSoftwareInstalado(List<String> softwareInstalado) {
        this.softwareInstalado = softwareInstalado;
    }

    public EstatusApartado getEstatusApartado() {
        return estatusApartado;
    }

    public void setEstatusApartado(EstatusApartado estatusApartado) {
        this.estatusApartado = estatusApartado;
    }

    public FuncionEquipo getFuncion() {
        return funcion;
    }

    public CentroComputoDominio getCentroComputo() {
        return centroComputo;
    }

    public void setLaboratorio(CentroComputoDominio centroComputo) {
        this.centroComputo = centroComputo;
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
        if (!(object instanceof ComputadoraDominio)) {
            return false;
        }
        ComputadoraDominio other = (ComputadoraDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ComputadoraDominio{" + "id=" + id + ", numeroMaquina=" + numeroMaquina + ", direccionIp=" + direccionIp + ", softwareInstalado=" + softwareInstalado + ", estatusApartado=" + estatusApartado + ", centroComputo=" + centroComputo + '}';
    }

}
