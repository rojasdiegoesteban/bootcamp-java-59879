package com.educacionit.clase11y12.classes;

import com.educacionit.clase11y12.interfaces.Formativa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Universidad extends Institucion implements Formativa {

    private List<Alumno> egresados;
    private List<String> carreras;

    private Long contadorAlumnos = 1L;

    public Universidad(String direccion, int superficie,
                       List<Alumno> egresados, List<String> carreras) {
        super(direccion, superficie);
        this.egresados = egresados;
        this.carreras = carreras;
    }

    public Universidad() {
        this("", 0, new ArrayList<>(), new ArrayList<>());
    }

    public List<Alumno> getEgresados() {
        return egresados;
    }

    public void setEgresados(List<Alumno> egresados) {
        this.egresados = egresados;
    }

    public List<String> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<String> carreras) {
        this.carreras = carreras;
    }

    /**
     * Método para agregar una nueva carrera
     *
     * @param carrera nombre de la carrera
     * @return true si se pudo guardar la carrera
     * o false si ya existe
     */
    public boolean altaCarrera(String carrera) {
        boolean exists = carreras.contains(carrera);
        if (exists) {
            return false;
        } else {
            carreras.add(carrera);
            return true;
        }
    }

    /**
     * Método para eliminar una carrera
     *
     * @param carrera nombre de la carrera
     */
    public void bajaCarrera(String carrera) {
        boolean exists = carreras.contains(carrera);
        if (exists) {
            carreras.remove(carrera);
        }
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
        return alumno;
    }

    @Override
    public Titulo egresar(Alumno alumno, String nombreTitulo) {
        // agregar a la lista de egresados
        egresados.add(alumno);

        // creo el título
        Date fechaDeEgreso = new Date(); // el constructor Date() me devuelve la fecha del momento
        Titulo titulo = new Titulo(nombreTitulo, fechaDeEgreso, alumno);
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Universidad that = (Universidad) o;
        return Objects.equals(egresados, that.egresados) && Objects.equals(carreras, that.carreras) && Objects.equals(contadorAlumnos, that.contadorAlumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), egresados, carreras, contadorAlumnos);
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "egresados=" + egresados +
                ", carreras=" + carreras +
                ", contadorAlumnos=" + contadorAlumnos +
                ", direccion='" + direccion + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}
