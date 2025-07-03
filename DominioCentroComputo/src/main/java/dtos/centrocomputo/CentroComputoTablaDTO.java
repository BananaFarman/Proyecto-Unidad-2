package dtos.centrocomputo;

import java.sql.Time;


public class CentroComputoTablaDTO {
    private Long id;
    private Time horaApertura;
    private Time horaCierre;
    private String nombreUnidad;
    private int  numComputadoras;

    public CentroComputoTablaDTO(Long id, Time horaApertura, Time horaCierre, String nombreUnidad, int numComputadoras) {
        this.id = id;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.nombreUnidad = nombreUnidad;
        this.numComputadoras = numComputadoras;
    }

    public Long getId() {
        return id;
    }

    public Time getHoraApertura() {
        return horaApertura;
    }

    public Time getHoraCierre() {
        return horaCierre;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public int getNumComputadoras() {
        return numComputadoras;
    }
}
