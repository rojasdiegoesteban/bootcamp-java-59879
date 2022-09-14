package com.educacionit.clase7.polimorfismo;

import com.educacionit.clase7.enums.ColoresDeVehiculo;
import com.educacionit.clase7.interfaces.Terreno;

import java.util.Objects;

public class Motocicleta implements Terreno {

    // Atributos

    private String marca;
    private String modelo;
    private ColoresDeVehiculo color;

    private int velocidad;

    // Constantes

    private static final int CANTIDAD_RUEDAS = 2;
    private static final double RODADO = 10.;

    public Motocicleta(String marca, String modelo, ColoresDeVehiculo color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Motocicleta() {
        this("","",ColoresDeVehiculo.BLANCO);
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

    public ColoresDeVehiculo getColor() {
        return color;
    }

    public void setColor(ColoresDeVehiculo color) {
        this.color = color;
    }

    @Override
    public void frenar() {
        this.velocidad--;
    }

    @Override
    public int getCantidadRuedas() {
        return CANTIDAD_RUEDAS;
    }

    @Override
    public double getRodado() {
        return RODADO;
    }

    public void acelerar() {
        this.velocidad++;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj instanceof Motocicleta) {

            Motocicleta moto = (Motocicleta) obj;

            isEqual =   this.color.equals(moto.color) &&
                        this.marca.equals(moto.marca) &&
                        this.modelo.equals(moto.modelo);
        }
        return isEqual;
    }

    @Override
    public String toString() {
        return "Motocicleta(" +
                "color=" + this.color +
                ", marca=" + this.marca +
                ", modelo=" + this.modelo +
                ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.color, this.marca, this.modelo);
    }


}
