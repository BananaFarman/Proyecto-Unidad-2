package com.mycompany.presentacionlabcomputo.temporales;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ApartadoEntTemp {
    int minutosDeUsoIngresado;
    LocalDateTime fechaYHoraApartado;
    LocalDate fechaApartado;
    LocalTime horaApartado;
    LocalTime horaFinOriginal;
    LocalTime horaFinUso;

    public ApartadoEntTemp(int minutosDeUsoIngresado) {
        this.minutosDeUsoIngresado = minutosDeUsoIngresado;
        fechaYHoraApartado = LocalDateTime.now();
        fechaApartado = fechaYHoraApartado.toLocalDate();
        horaApartado = fechaYHoraApartado.toLocalTime();
        horaFinOriginal = horaApartado.plusMinutes(minutosDeUsoIngresado);

    }

    public LocalTime getHoraFinUso() {
        return horaFinUso;
    }

    public LocalTime getHoraFinOriginal() {
        return horaFinOriginal;
    }

    public LocalTime getHoraInicio() {
        return horaApartado;
    }

    public LocalDateTime  getFechaYHoraApartado() {
        return fechaYHoraApartado;
    }

    public LocalDate getFechaApartado() {
        return fechaApartado;
    }

    public void setFechaApartado(LocalDate fechaApartado) {
        this.fechaApartado = fechaApartado;
    }

    public void setHoraFinUso() {
        horaFinUso = LocalTime.now();
    }

}
