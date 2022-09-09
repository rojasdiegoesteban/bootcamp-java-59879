package com.educacionit.clase8.classes;

import com.educacionit.clase8.enums.Color;
import com.educacionit.clase8.enums.Gender;

import java.util.Objects;

public class Fish extends Animal {

    private int size;
    private Color color;

    private static final boolean MAMMAL = false;

    public Fish() {
        this(0, null, 0, null);
    }

    public Fish(int age, Gender gender, // animal
                int size, Color color // fish
    ) {
        super(age, gender, MAMMAL);
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void swim() {
        // todo
    }

    @Override
    public String[] aliments() {
        return new String[]{
                "Alimento para peces", "lombrices", "algas"
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fish fish = (Fish) o;
        return size == fish.size && color == fish.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, color);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "size=" + size +
                ", color=" + color +
                ", age=" + age +
                ", gender=" + gender +
                ", mammal=" + mammal +
                '}';
    }
}
