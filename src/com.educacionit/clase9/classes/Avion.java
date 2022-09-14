package com.educacionit.clase9.classes;

import com.educacionit.clase9.enums.Propulsion;

import java.util.Objects;

public class Avion extends Volador {

    protected int numeroAsientos;
    protected int numeroTurbinas;

    private double capacidadTanque;

    /*
        SOBRECARGA DE CONSTRUCTOR
     */

    public Avion(String nombre, Propulsion propulsion,
                 int numeroAsientos, int numeroTurbinas) {
        super(nombre, propulsion);
        this.numeroAsientos = numeroAsientos;
        this.numeroTurbinas = numeroTurbinas;
    }

    public Avion(int numeroAsientos, int numeroTurbinas) {
        super();
        this.numeroAsientos = numeroAsientos;
        this.numeroTurbinas = numeroTurbinas;
    }

    public Avion() {
        //this("", null, 0, 0);
        super();
        this.numeroAsientos = 0;
        this.numeroTurbinas = 0;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public void setNumeroTurbinas(int numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;
    }

    /*
        SOBRECARGA DE MÉTODOS
     */

    public void cargarCombustible(double cantidad) {
        capacidadTanque += cantidad;
        System.out.println("La capacidad del tanque de avión es " + capacidadTanque);
    }

    public void cargarCombustible(String cantidad) {
        System.out.println("La capacidad del tanque de avión es " + cantidad);
    }

    public void cargarCombustible(int cantidad, int calidad) {
        capacidadTanque = calidad * cantidad;
        System.out.println("La capacidad del tanque de avión es " + cantidad);
    }

    /*
        SOBRE-ESCRITURA DE MÉTODOS
     */

    @Override
    public void despegar() {
        // esto es para demostración
        System.out.println(this.nombre + " está despegando sobre la pista...");
    }

    @Override
    public void aterrizar() {
        // esto es para demostración
        System.out.println(this.nombre + " está aterrizando sobre la pista...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Avion avion = (Avion) o;
        return numeroAsientos == avion.numeroAsientos && numeroTurbinas == avion.numeroTurbinas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroAsientos, numeroTurbinas);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "numeroAsientos=" + numeroAsientos +
                ", numeroTurbinas=" + numeroTurbinas +
                ", nombre='" + nombre + '\'' +
                ", propulsion=" + propulsion +
                '}';
    }
}
