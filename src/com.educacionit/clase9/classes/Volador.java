package com.educacionit.clase9.classes;

import com.educacionit.clase9.enums.Propulsion;

import java.util.Objects;

public abstract class Volador {

    protected String nombre;
    protected Propulsion propulsion;

    public Volador(String nombre, Propulsion propulsion) {
        this.nombre = nombre;
        this.propulsion = propulsion;
    }

    public Volador() {
        this("", null);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Propulsion getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(Propulsion propulsion) {
        this.propulsion = propulsion;
    }

    public abstract void despegar();

    public abstract void aterrizar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volador volador = (Volador) o;
        return Objects.equals(nombre, volador.nombre) && propulsion == volador.propulsion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, propulsion);
    }

    @Override
    public String toString() {
        return "Volador{" +
                "nombre='" + nombre + '\'' +
                ", propulsion=" + propulsion +
                '}';
    }
}
