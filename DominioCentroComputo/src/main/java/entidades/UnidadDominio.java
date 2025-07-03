package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * @author brand
 */
@Entity
public class UnidadDominio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @OneToMany(mappedBy = "unidad")
    private List<CentroComputoDominio> centrosDeComputo;

    @OneToMany(mappedBy = "unidad")
    private List<CarreraDominio> carreras;

    public UnidadDominio() {
    }

    public UnidadDominio(String nombre, List<CentroComputoDominio> centrosDeComputo, List<CarreraDominio> carreras) {
        this.nombre = nombre;
        this.centrosDeComputo = centrosDeComputo;
        this.carreras = carreras;
    }

    public UnidadDominio(String nombre){
        this.nombre = nombre;
    }

    public UnidadDominio(Long id, String nombre, List<CentroComputoDominio> centrosDeComputo, List<CarreraDominio> carreras) {
        this.id = id;
        this.nombre = nombre;
        this.centrosDeComputo = centrosDeComputo;
        this.carreras = carreras;
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

    public List<CentroComputoDominio> getCentrosDeComputo() {
        return centrosDeComputo;
    }

    public void setCentrosDeComputo(List<CentroComputoDominio> centrosDeComputo) {
        this.centrosDeComputo = centrosDeComputo;
    }

    public List<CarreraDominio> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<CarreraDominio> carreras) {
        this.carreras = carreras;
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
        if (!(object instanceof UnidadDominio)) {
            return false;
        }
        UnidadDominio other = (UnidadDominio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UnidadDominio{" + "id=" + id + ", nombre=" + nombre + ", centrosDeComputo=" + centrosDeComputo + ", carreras=" + carreras + '}';
    }

}
