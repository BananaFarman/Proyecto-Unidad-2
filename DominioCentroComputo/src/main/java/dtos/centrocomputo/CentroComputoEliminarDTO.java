package dtos.centrocomputo;

/**
 * @author brand
 */
public class CentroComputoEliminarDTO {

    private Long id;

    public CentroComputoEliminarDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CentroComputoEliminarDTO{" + "id=" + id + '}';
    }

}
