package com.educacionit.clase7.polimorfismo;

import com.educacionit.clase7.enums.ColoresDeVehiculo;
import com.educacionit.clase7.interfaces.Terreno;
import com.educacionit.clase7.interfaces.Vehiculo;

import java.util.Objects;

public class Auto implements Vehiculo, Terreno {

    private ColoresDeVehiculo color;
    private String marca;
    private String modelo;
    private int cantidadPuertas;
    private boolean isDescapotable;
    private boolean isDiesel;

    private int velocidad;
    private int cambio = 1;

    // Constantes siempre static final y en UPPER_SNAKE_CASE
    private static final int CANTIDAD_RUEDAS = 4;
    private static final double RODADO = 17.;

    public Auto() {
        this(ColoresDeVehiculo.BLANCO, "-", "-", 3, false, false);
    }

    /**
     * @param marca  marca del auto (ex: Fiat)
     * @param modelo modelo del auto (ex: Chronos)
     */
    public Auto(String marca, String modelo) {
        this(ColoresDeVehiculo.BLANCO, marca, modelo, 3, false, false);
    }

    /**
     * @param color           color del auto del tipo {@link ColoresDeVehiculo}
     * @param marca           marca del auto
     * @param modelo          model del auto
     * @param cantidadPuertas cantidad de puertas (default = 3)
     * @param isDescapotable  es descapotable o no
     * @param isDiesel        es diesel o es naftero
     */
    public Auto(ColoresDeVehiculo color, String marca, String modelo,
                int cantidadPuertas, boolean isDescapotable, boolean isDiesel) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadPuertas = cantidadPuertas;
        this.isDescapotable = isDescapotable;
        this.isDiesel = isDiesel;
    }

    public ColoresDeVehiculo getColor() {
        return color;
    }

    public void setColor(ColoresDeVehiculo color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = ColoresDeVehiculo.valueOf(color.toUpperCase());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public boolean isDescapotable() {
        return isDescapotable;
    }

    public void setDescapotable(boolean descapotable) {
        isDescapotable = descapotable;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getCambio() {
        return cambio;
    }

    /**
     * incrementa la velocidad en 1
     */
    public void acelerar() {
        this.velocidad++;
    }

    /**
     * decrementa la velocidad en 1
     */
    public void frenar() {
        this.velocidad--;
    }

    /**
     * incrementa cambio hasta 5
     */
    public void incrementarCambio() {
        if (this.cambio < 5) {
            this.cambio++;
        }
    }

    /**
     * decrementa cambio hasta 1
     */
    public void decrementarCambio() {
        if (this.cambio > 1) {
            this.cambio--;
        }
    }

    /**
     * Método que me recupera la cantidad de ruedas
     * @return cantidad de Ruedas
     */
    public int getCantidadRuedas() {
        return CANTIDAD_RUEDAS;
    }

    /**
     * Método que me recupera el rodado del Auto
     * @return rodado
     */
    public double getRodado() {
        return RODADO;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj instanceof Auto) {

            Auto auto = (Auto) obj;

            isEqual = this.marca.equals(auto.getMarca())
                    && this.modelo.equals(auto.getModelo())
                    && this.color.equals(auto.getColor());
        }
        return isEqual;
    }

    @Override
    public String toString() {
        return "Auto(" +
                "color=" + this.color +
                ", marca=" + this.marca +
                ", modelo=" + this.modelo +
                ", isDescapotable=" + this.isDescapotable +
                ", isDiesel=" + this.isDiesel +
                ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.marca, this.modelo, this.color);
    }

}
