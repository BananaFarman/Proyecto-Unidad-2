package com.mycompany.presentacionlabcomputo.temporales;

public class CarreraEntTemp {

    private String id;
    private String nombre;
    private int minTiempoLimite;

    public CarreraEntTemp(String id, String nombre, int minTiempoLimite) {
        this.id = id;
        this.nombre = nombre;
        this.minTiempoLimite = minTiempoLimite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinTiempoLimite() {
        return minTiempoLimite;
    }

    public void setMinTiempoLimite(int minTiempoLimite) {
        this.minTiempoLimite = minTiempoLimite;
    }
}
