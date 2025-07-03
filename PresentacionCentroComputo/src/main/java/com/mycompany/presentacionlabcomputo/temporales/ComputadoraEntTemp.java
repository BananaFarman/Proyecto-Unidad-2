package com.mycompany.presentacionlabcomputo.temporales;

import java.util.List;

public class ComputadoraEntTemp {
    private String id;
    private String numMaquina;
    private String disponibilidad;
    private String direccionIp;
    private List<String> softwareDisponible;

    public ComputadoraEntTemp(String id, String numMaquina, String disponibilidad, String direccionIp, List<String> softwareDisponible) {
        this.id = id;
        this.numMaquina = numMaquina;
        this.disponibilidad = disponibilidad;
        this.direccionIp = direccionIp;
        this.softwareDisponible = softwareDisponible;
    }

    public String getId() {
        return id;
    }

    public String getNumMaquina() {
        return numMaquina;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public String getDireccionIp() {
        return direccionIp;
    }

    public List<String> getSoftwareDisponible() {
        return softwareDisponible;
    }
}
