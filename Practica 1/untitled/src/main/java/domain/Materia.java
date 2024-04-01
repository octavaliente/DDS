package domain;

import java.util.List;

public class Materia {
    private String nombre;
    private List <Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public List<Materia> getCorrelativas() {
        return this.correlativas;
    }
}
