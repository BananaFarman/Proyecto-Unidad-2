package dtos.computadora;

import enums.EstatusApartado;

/**
 *
 * @author brand
 */
public class ComputadoraActualizarDTO {

    private Long id;
    private EstatusApartado estatusApartado;

    public ComputadoraActualizarDTO(Long id, EstatusApartado estatusApartado) {
        this.id = id;
        this.estatusApartado = estatusApartado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstatusApartado getEstatusApartado() {
        return estatusApartado;
    }

    public void setEstatusApartado(EstatusApartado estatusApartado) {
        this.estatusApartado = estatusApartado;
    }

    @Override
    public String toString() {
        return "ComputadoraActualizarDTO{" + "id=" + id + ", estatusApartado=" + estatusApartado + '}';
    }

}
