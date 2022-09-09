package com.educacionit.clase8.classes;

import com.educacionit.clase8.enums.Gender;

import java.util.Objects;

/**
 * Clase Padre
 */
public class Animal {

    // el modificador de acceso protected
    // le permite al atributo ser accedido
    // desde una clase hija
    protected int age;
    protected Gender gender;
    protected boolean mammal;

    public Animal() {
        this(0, null, false);
    }

    /**
     * @param age    años de vida
     * @param gender si es macho o hembra
     * @param mammal si es mamífero
     */
    public Animal(int age, Gender gender, boolean mammal) {
        this.age = age;
        this.gender = gender;
        this.mammal = mammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isMammal() {
        return this.mammal;
    }

    public String[] aliments() {
        return new String[]{
                "comida"
        };
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender=" + gender +
                ", mammal=" + mammal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                mammal == animal.mammal &&
                gender == animal.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, gender, mammal);
    }
}
