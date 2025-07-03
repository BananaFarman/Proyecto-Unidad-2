package com.mycompany.presentacionlabcomputo.temporales;

public class BloqueoEntTemp {

    private String id;
    private String fecha;
    private String motivo;

    public BloqueoEntTemp(String id, String fecha, String motivo) {
        this.id = id;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
