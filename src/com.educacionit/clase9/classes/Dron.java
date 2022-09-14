package com.educacionit.clase9.classes;

import com.educacionit.clase9.enums.DronSize;
import com.educacionit.clase9.enums.Propulsion;

import java.util.Objects;

public final class Dron extends Volador {

    private int numeroHelices;
    private DronSize size;

    public Dron(String nombre, Propulsion propulsion,
                int numeroHelices, DronSize size) {
        super(nombre, propulsion);
        this.numeroHelices = numeroHelices;
        this.size = size;
    }

    public Dron() {
        // this("", null, 0, null);
        super();
        this.numeroHelices = 0;
        this.size = null;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    public DronSize getSize() {
        return size;
    }

    public void setSize(DronSize size) {
        this.size = size;
    }

    public void grabar() {
        // todo
    }

    public void fotografiar() {
        // todo
    }

    @Override
    public void despegar() {
        // esto es para demostración
        System.out.println(this.nombre + " está despegando...");
    }

    @Override
    public void aterrizar() {
        // esto es para demostración
        System.out.println(this.nombre + " está aterrizando...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dron dron = (Dron) o;
        return numeroHelices == dron.numeroHelices && size == dron.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroHelices, size);
    }

    @Override
    public String toString() {
        return "Dron{" +
                "numeroHelices=" + numeroHelices +
                ", size=" + size +
                ", nombre='" + nombre + '\'' +
                ", propulsion=" + propulsion +
                '}';
    }
}
