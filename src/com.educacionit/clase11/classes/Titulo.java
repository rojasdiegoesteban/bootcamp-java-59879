package com.educacionit.clase11.classes;

import java.util.Date;
import java.util.Objects;

public final class Titulo {
    private String nombre;
    private Date fechaDeEgreso;
    private Alumno alumno;

    public Titulo(String nombre, Date fechaDeEgreso, Alumno alumno) {
        this.nombre = nombre;
        this.fechaDeEgreso = fechaDeEgreso;
        this.alumno = alumno;
    }

    public Titulo() {
        this("", new Date(), new Alumno());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeEgreso() {
        return fechaDeEgreso;
    }

    public void setFechaDeEgreso(Date fechaDeEgreso) {
        this.fechaDeEgreso = fechaDeEgreso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Titulo titulo = (Titulo) o;
        return Objects.equals(nombre, titulo.nombre) && Objects.equals(fechaDeEgreso, titulo.fechaDeEgreso) && Objects.equals(alumno, titulo.alumno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaDeEgreso, alumno);
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeEgreso=" + fechaDeEgreso +
                ", alumno=" + alumno +
                '}';
    }
}
