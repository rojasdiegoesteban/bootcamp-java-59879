package com.educacionit.clase10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Estrategia para definir objetos inmutables:
 * 1. NO proporcionar setters
 * 2. Hacer los atributos PRIVADOS FINAL
 * 3. No permitir sobrescribir métodos, la forma más sencilla es declarar la clase como FINAL
 * 4. No compartir referencias a los objetos mutables (compartir una copia)
 */
public final class InmutableClass {

    private final int id;
    private final String name;
    private final List<Integer> values;

    public InmutableClass(int id, String name, List<Integer> values) {
        this.id = id;
        this.name = name;
        this.values = (values != null) ? new ArrayList<>(values) : new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getValues() {
        return Collections.unmodifiableList(values); // lista no-modificable
        // return new ArrayList<>(values); // copia
        // return values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InmutableClass that = (InmutableClass) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "InmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
