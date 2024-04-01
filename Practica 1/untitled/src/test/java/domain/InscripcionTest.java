package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTest {
    @Test
    public void aceptaInscripcion(){
        Materia materia1 = new Materia("materia1");
        Materia materia2 = new Materia("materia2");
        Materia materia3 = new Materia("materia3");

        Materia materia4 = new Materia("materia4");

        List<Materia> materiasCorrelativas = new ArrayList<Materia>();

        materiasCorrelativas.add(materia1);
        materiasCorrelativas.add(materia2);

        materiasCorrelativas.add(materia4);

        materia3.setCorrelativas(materiasCorrelativas);

        Alumno alumno = new Alumno();

        alumno.setMateriasAprobadas(materiasCorrelativas);

        Inscripcion inscripcion = new Inscripcion(alumno);

        List<Materia> materiasInscripcion = new ArrayList<Materia>();

        materiasInscripcion.add(materia3);

        inscripcion.setMaterias(materiasInscripcion);

        Assert.assertEquals(true, inscripcion.aprobada());
    }
}
