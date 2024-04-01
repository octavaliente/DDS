package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public boolean aprobada(){
        return this.materias
                .stream()
                .allMatch(unaMateria -> this.alumno.tieneAprobadas(unaMateria.getCorrelativas()));
    }
}
