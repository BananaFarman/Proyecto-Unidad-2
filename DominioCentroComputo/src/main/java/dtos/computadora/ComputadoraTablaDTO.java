package dtos.computadora;

import java.sql.Time;

public class ComputadoraTablaDTO {
    private Long id;
    private String direccionIP;
    private Integer numeroEquipo;
    private String estado;
    private String funcion;

    public ComputadoraTablaDTO(Long id, String direccionIP, Integer numeroEquipo, String estado, String funcion) {
        this.id = id;
        this.direccionIP = direccionIP;
        this.numeroEquipo = numeroEquipo;
        this.estado = estado;
        this.funcion = funcion;
    }

    public String getFuncion() {
        return funcion;
    }

    public String getEstado() {
        return estado;
    }

    public Integer getNumeroEquipo() {
        return numeroEquipo;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public Long getId() {
        return id;
    }
}
