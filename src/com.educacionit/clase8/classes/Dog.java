package com.educacionit.clase8.classes;

import com.educacionit.clase8.enums.Gender;

import java.util.Objects;

public class Dog extends Animal {

    private String breed;
    private boolean isPuppy;

    // constantes

    private static final boolean MAMMAL = true;

    public Dog() {
        this(0, null, "", false);
    }

    public Dog(int age, Gender gender, // animal
               String breed, boolean isPuppy // dog
    ) {
        //super(age, gender, MAMMAL);

        // atributos de la clase padre
        super.age = age;
        super.gender = gender;
        super.mammal = MAMMAL;

        // atributos de la propia clase
        this.breed = breed;
        this.isPuppy = isPuppy;
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isPuppy() {
        return isPuppy;
    }

    public void setPuppy(boolean puppy) {
        isPuppy = puppy;
    }

    public void bark() {
        // todo
    }

    @Override
    public String[] aliments() {
        return new String[]{
                "Carne", "Alimento Balanceado", "Perrarina"
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return isPuppy == dog.isPuppy && breed.equals(dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, isPuppy);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", isPuppy=" + isPuppy +
                ", age=" + age +
                ", gender=" + gender +
                ", mammal=" + mammal +
                '}';
    }
}
