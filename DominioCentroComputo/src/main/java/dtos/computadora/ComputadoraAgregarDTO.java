package dtos.computadora;

/**
 *
 * @author brand
 */
public class ComputadoraAgregarDTO {

    private Integer numeroMaquina;
    private String direccionIp;
    private Long idLaboratorio;

    public ComputadoraAgregarDTO(Integer numeroMaquina, String direccionIp, Long idLaboratorio) {
        this.numeroMaquina = numeroMaquina;
        this.direccionIp = direccionIp;
        this.idLaboratorio = idLaboratorio;
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

    public Long getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(Long idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    @Override
    public String toString() {
        return "ComputadoraAgregarDTO{" + "numeroMaquina=" + numeroMaquina + ", direccionIp=" + direccionIp + ", idLaboratorio=" + idLaboratorio + '}';
    }

}
