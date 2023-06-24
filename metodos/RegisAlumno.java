package metodos;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mundo del Saber
 */
public class RegisAlumno {

    private List<Alumno> alumnos;

    public RegisAlumno() {
        alumnos = new ArrayList<>();
    }

    public int buscar(String alumno) {
        int n = -1;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getUsuario().equals(alumno)) {
                n = i;
                break;
            }
        }
        return n;
    }

    public boolean insertar(Alumno alumno) {
        if (buscar(alumno.getUsuario()) == -1) {
            alumnos.add(alumno);
            return true;
        } else {
            return false;
        }
    }

    public Alumno obtener(String alumno) {
        if (buscar(alumno) != -1) {
            return alumnos.get(buscar(alumno));
        } else {
            return null;
        }
    }
}
