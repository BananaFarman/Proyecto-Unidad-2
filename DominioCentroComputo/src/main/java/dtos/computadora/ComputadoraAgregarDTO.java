package dtos.computadora;

import entidades.CentroComputoDominio;
import enums.FuncionEquipo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brand
 */
public class ComputadoraAgregarDTO {
    private String sistemaOperativo;
    private FuncionEquipo funcion;
    private Integer numeroMaquina;
    private String direccionIp;
    private List<String> softwareInstalado;
    private CentroComputoDominio centroComputo;

    public ComputadoraAgregarDTO(String sistemaOperativo, FuncionEquipo funcion, Integer numeroMaquina, String ip, List<String> softwareInstalado, CentroComputoDominio centroComputo) {
        this.sistemaOperativo = sistemaOperativo;
        this.funcion = funcion;
        this.numeroMaquina = numeroMaquina;
        this.direccionIp = ip;
        if (softwareInstalado == null) {
            this.softwareInstalado = new ArrayList<>();
        } else {
            this.softwareInstalado = softwareInstalado;
        }
        this.centroComputo = centroComputo;
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

    public CentroComputoDominio getCentroComputo() {
        return centroComputo;
    }

    public void setCentroComputo(CentroComputoDominio centroComputo) {
        this.centroComputo = centroComputo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public FuncionEquipo getFuncion() {
        return funcion;
    }

    public List<String> getSoftwareInstalado() {
        return softwareInstalado;
    }

    @Override
    public String toString() {
        return "ComputadoraAgregarDTO{" + "numeroMaquina=" + numeroMaquina + ", direccionIp=" + direccionIp + ", idLaboratorio=" + centroComputo + '}';
    }

}
