package com.educacionit.clase11.classes;

import java.util.Objects;

public abstract class Institucion {

    protected String direccion;
    protected int superficie;

    public Institucion(String direccion, int superficie) {
        this.direccion = direccion;
        this.superficie = superficie;
    }

    public Institucion() {
        this("", 0);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public abstract void pagasImpuestos();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institucion that = (Institucion) o;
        return superficie == that.superficie && Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, superficie);
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "direccion='" + direccion + '\'' +
                ", superficie=" + superficie +
                '}';
    }
}
