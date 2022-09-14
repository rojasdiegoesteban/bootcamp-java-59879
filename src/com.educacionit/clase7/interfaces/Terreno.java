package com.educacionit.clase7.interfaces;

public interface Terreno {

    // los métodos son SIEMPRE public y abstract, entonces no hay que definirlo

    //public abstract void frenar();
    void frenar();

    public abstract int getCantidadRuedas();
    public abstract double getRodado();
}
