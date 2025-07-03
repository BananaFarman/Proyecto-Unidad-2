package com.mycompany.presentacionlabcomputo.temporales;

public class CentroComputoEntTemp {
    private String id;
    private String nombre;
    private int numComputadoras;
    private int hLimiteServicio;

    public CentroComputoEntTemp(String id, String nombre, int numComputadoras, int hLimiteServicio) {
        this.id = id;
        this.nombre = nombre;
        this.numComputadoras = numComputadoras;
        this.hLimiteServicio = hLimiteServicio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumComputadoras() {
        return numComputadoras;
    }

    public int gethLimiteServicio() {
        return hLimiteServicio;
    }

}
