package com.educacionit.clase8.classes;

import com.educacionit.clase8.enums.Gender;

import java.util.Objects;

public class Man extends Animal {

    private double height;
    private double weight;

    private static final boolean MAMMAL = true;

    public Man(int age, Gender gender, // Animal
               double height, double weight // Man
    ) {
        super(age, gender, MAMMAL);
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void plan() {
        // todo
    }

    //@Override
    public String[] aliments() {
        return new String[]{
                "pizza", "hamburguesa", "sushi"
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Man man = (Man) o;
        return Double.compare(man.height, height) == 0 &&
                Double.compare(man.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, weight);
    }

    @Override
    public String toString() {
        return "Man{" +
                "height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", mammal=" + mammal +
                '}';
    }
}
