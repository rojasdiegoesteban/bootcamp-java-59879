package com.educacionit.clase9.classes;

import com.educacionit.clase9.enums.Color;
import com.educacionit.clase9.enums.Propulsion;

import java.util.Objects;

public final class Jet extends Avion {

    private int numeroCochera;
    private Color color;

    private int tanque;

    public Jet(String nombre, Propulsion propulsion, // Volador
               int numeroAsientos, int numeroTurbinas, // Avion
               int numeroCochera, Color color // Jet
    ) {
        super(nombre, propulsion, numeroAsientos, numeroTurbinas);
        this.numeroCochera = numeroCochera;
        this.color = color;
    }

    public Jet() {
        /*super();
        this.numeroCochera = 0;
        this.color = null;*/

        this("", null, 0, 0, 0, null);
    }

    public int getNumeroCochera() {
        return numeroCochera;
    }

    public void setNumeroCochera(int numeroCochera) {
        this.numeroCochera = numeroCochera;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void servirChampagne() {
        // todo
    }

    public void servirCaviar() {
        // todo
    }

    /*
        SOBRE-ESCRITURA DE MÉTODOS
     */

    @Override
    public void cargarCombustible(double cantidad) {
        tanque += cantidad;
        System.out.println("El tanque del jet tiene " + tanque);
    }

    @Override
    public void despegar() {
        // esto es para demostración
        System.out.println(this.nombre + " está despegando sobre la pista privada...");
    }

    @Override
    public void aterrizar() {
        // esto es para demostración
        System.out.println(this.nombre + " está aterrizando sobre la pista privada...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jet jet = (Jet) o;
        return numeroCochera == jet.numeroCochera && color == jet.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroCochera, color);
    }

    @Override
    public String toString() {
        return "Jet{" +
                "numeroCochera=" + numeroCochera +
                ", color=" + color +
                ", numeroAsientos=" + numeroAsientos +
                ", numeroTurbinas=" + numeroTurbinas +
                ", nombre='" + nombre + '\'' +
                ", propulsion=" + propulsion +
                '}';
    }
}
