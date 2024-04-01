package domain;

import java.util.List;

public class Alumno {
    private List <Materia> materiasAprobadas;

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean tieneAprobadas(List <Materia> unasMaterias){
        return materiasAprobadas.containsAll(unasMaterias);
    }
}
