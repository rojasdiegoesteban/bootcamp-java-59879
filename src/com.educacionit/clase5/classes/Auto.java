package com.educacionit.clase5.classes;

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

    /*
        Constructors
     */
    public Auto() {
        color = "blanco";
        marca = "-";
        modelo = "-";
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
}
