package com.educacionit.clase5y6.classes;

import java.util.Objects;

public class Auto {
    /*
        Attributes (characteristics)
     */
    private String color;
    private String marca;
    private String modelo;
    private int cantidadPuertas;
    private boolean isDescapotable;
    private boolean isDiesel;

    private int velocidad;
    private int cambio = 1;

    /*
        Constructors
     */

    public Auto() {
        /*
            seteamos valores por defecto
         */
        color = "blanco";
        marca = "-";
        modelo = "-";
        cantidadPuertas = 3;
        isDescapotable = false;
        isDiesel = false;

        //this("blanco", "-", "-", 3, false, false);
    }

    /**
     *
     * @param color color del auto (default = blanco)
     * @param marca marca del auto
     * @param modelo model del auto
     * @param cantidadPuertas cantidad de puertas (default = 3)
     * @param isDescapotable es descapotable o no
     * @param isDiesel es diesel o es naftero
     */
    public Auto(String color, String marca, String modelo,
                int cantidadPuertas, boolean isDescapotable, boolean isDiesel) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadPuertas = cantidadPuertas;
        this.isDescapotable = isDescapotable;
        this.isDiesel = isDiesel;
    }

    /**
     *
     * @param marca marca del auto (ex: Fiat)
     * @param modelo modelo del auto (ex: Chronos)
     */
    public Auto(String marca, String modelo) {
        color = "blanco";
        this.marca = marca;
        this.modelo = modelo;
        cantidadPuertas = 3;
        isDescapotable = false;
        isDiesel = false;
    }

    /*
        Getters and Setters
     */

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    /*
        behaviour
     */

    /**
     * Este método incrementa la velocidad en 1
     */
    public void acelerar() {
        this.velocidad++;
    }

    /**
     * Este método decrementa la velocidad en 1
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
        if(this.cambio > 1) {
            this.cambio--;
        }
    }

    /*
        métodos comunes en todos los objetos
        (que podemos sobrescribir)
     */

    @Override // sobrescrito
    public boolean equals(Object obj) {
        boolean isEqual = false;

        // ¿Es obj instancia de Auto?
        if (obj instanceof Auto) {
            // casteo
            Auto auto = (Auto) obj;

            // evaluar mis criterios de comparación
            isEqual = this.marca.equals(auto.getMarca())
                    && this.modelo.equals(auto.getModelo())
                    && this.color.equals(auto.getColor());
        }

        return isEqual;
    }

    @Override // sobrescrito
    public String toString() {
        return "Auto(" +
                    "color=" + this.color +
                    ", marca=" + this.marca +
                    ", modelo=" + this.modelo +
                    ", isDescapotable=" + this.isDescapotable +
                    ", isDiesel=" + this.isDiesel +
                ")";
    }

    @Override // sobrescrito
    public int hashCode() {
        // criterios para generar un hashcode
        return Objects.hash(this.marca, this.modelo, this.color);
    }

}
