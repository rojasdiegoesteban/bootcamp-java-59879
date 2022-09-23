package com.educacionit.clase11y12.classes;

import com.educacionit.clase11y12.interfaces.Formativa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Escuela extends Institucion implements Formativa {

    private List<Alumno> alumnos;
    private List<String> grados;

    private Long contadorAlumnos = 100L;

    public Escuela(String direccion, int superficie,
                   List<Alumno> alumnos, List<String> grados) {
        super(direccion, superficie);
        this.alumnos = alumnos;
        this.grados = grados;
    }

    public Escuela() {
        this("", 0, new ArrayList<>(), new ArrayList<>());
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<String> getGrados() {
        return grados;
    }

    public void setGrados(List<String> grados) {
        this.grados = grados;
    }

    /**
     * Método para dar de baja un alumno
     *
     * @param id identificador del alumno
     * @return true si se eliminó o false en caso contrario
     */
    public boolean bajaAlumno(Long id) {
        // necesito obtener el Alumno con el id que me pasen
        Alumno alumnoAEliminar = null;

        // buscar el Alumno
        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                alumnoAEliminar = alumno;
                break;
            }
        }

        if (alumnoAEliminar != null) {
            alumnos.remove(alumnoAEliminar);
            return true;
        }
        return false;
    }

    @Override
    public void pagasImpuestos() {
        // todo implementar cuerpo del método
    }

    @Override
    public Alumno inscribir(String nombre) {
        // creo el alumno
        Long id = contadorAlumnos++;
        Alumno alumno = new Alumno(id, nombre);

        // agregar al listado
        alumnos.add(alumno);

        return alumno;
    }

    @Override
    public Titulo egresar(Alumno alumno, String nombreTitulo) {
        Titulo titulo = null;
        if (alumnos.contains(alumno)) {
            Date fechaDeEgreso = new Date();
            titulo = new Titulo(nombreTitulo, fechaDeEgreso, alumno);
        }
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Escuela escuela = (Escuela) o;
        return Objects.equals(alumnos, escuela.alumnos) && Objects.equals(grados, escuela.grados) && Objects.equals(contadorAlumnos, escuela.contadorAlumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), alumnos, grados, contadorAlumnos);
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "alumnos=" + alumnos +
                ", grados=" + grados +
                ", contadorAlumnos=" + contadorAlumnos +
                ", direccion='" + direccion + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}
