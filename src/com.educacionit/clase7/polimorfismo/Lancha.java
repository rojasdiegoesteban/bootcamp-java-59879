package com.educacionit.clase7.polimorfismo;

import com.educacionit.clase7.enums.ColoresDeVehiculo;
import com.educacionit.clase7.interfaces.Vehiculo;

import java.util.Objects;

public class Lancha implements Vehiculo {

    private ColoresDeVehiculo color;
    private String nombre;
    private int cantidadDePuestosDisponibles;
    private boolean isAnclado;

    private int velocidad;
    private int cambio = 1;

    /**
     *
     * @param color color de la lancha
     * @param nombre nombre de bautismo
     * @param cantidadDePuestosDisponibles numero de asientos
     * @param isAnclado si está o no anclado
     */
    public Lancha(ColoresDeVehiculo color,
                  String nombre,
                  int cantidadDePuestosDisponibles,
                  boolean isAnclado) {
        this.color = color;
        this.nombre = nombre;
        this.cantidadDePuestosDisponibles = cantidadDePuestosDisponibles;
        this.isAnclado = isAnclado;
    }

    public Lancha() {
        this(ColoresDeVehiculo.BLANCO, "", 0, false);
    }

    public ColoresDeVehiculo getColor() {
        return color;
    }

    public void setColor(ColoresDeVehiculo color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDePuestosDisponibles() {
        return cantidadDePuestosDisponibles;
    }

    public void setCantidadDePuestosDisponibles(int cantidadDePuestosDisponibles) {
        this.cantidadDePuestosDisponibles = cantidadDePuestosDisponibles;
    }

    public boolean isAnclado() {
        return isAnclado;
    }

    public void setAnclado(boolean anclado) {
        this.isAnclado = anclado;
    }

    public void acelerar() {
        if (!isAnclado) {
            this.velocidad++;
        }
    }

    public void desacelerar() {
        this.velocidad--;
    }

    public void incrementarCambio() {
        this.cambio++;
    }

    public void decrementarCambio() {
        this.cambio--;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj instanceof Lancha) {

            Lancha lancha = (Lancha) obj;

            isEqual =   this.color.equals(lancha.color) &&
                        this.nombre.equals(lancha.nombre);
        }
        return isEqual;
    }

    @Override
    public String toString() {
        return "Lancha(" +
                "color=" + this.color +
                ", nombre=" + this.nombre +
                ", cantidadDePuestosDisponibles=" + this.cantidadDePuestosDisponibles +
                ", isAnclado=" + this.isAnclado +
                ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.color, this.nombre);
    }

}
