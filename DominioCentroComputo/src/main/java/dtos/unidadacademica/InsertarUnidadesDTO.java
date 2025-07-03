package dtos.unidadacademica;

import entidades.UnidadDominio;

import java.util.List;

public class InsertarUnidadesDTO {
    private List<UnidadDominio> unidadesAcademicas;

    public InsertarUnidadesDTO(List<UnidadDominio> unidadesAcademicas) {
        this.unidadesAcademicas = unidadesAcademicas;
    }

    public List<UnidadDominio> getUnidadesAcademicas() {
        return unidadesAcademicas;
    }

}
