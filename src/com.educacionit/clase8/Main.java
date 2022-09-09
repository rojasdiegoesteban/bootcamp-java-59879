package com.educacionit.clase8;

import com.educacionit.clase8.classes.Animal;
import com.educacionit.clase8.classes.Dog;
import com.educacionit.clase8.classes.Fish;
import com.educacionit.clase8.classes.Man;
import com.educacionit.clase8.enums.Color;
import com.educacionit.clase8.enums.Gender;

public class Main {

    public static void main(String[] args) {

        // clase padre
        Animal female = new Animal(15, Gender.FEMALE, false);
        //System.out.println(female);

        Animal male = new Animal(15, Gender.MALE, false);
        //System.out.println(male);

        Animal maleMammal = new Animal(15, Gender.MALE, true);
        //System.out.println(maleMammal);

        // clases hijas

        Dog terrier = new Dog(1, Gender.FEMALE, "Terrier", true);
        //System.out.println(terrier);

        Man human = new Man(30, Gender.FEMALE, 60., 1.7);
        //System.out.println(human);

        /*
            Polimorfismo
         */

        Fish nemo = new Fish(1, Gender.MALE, 2, Color.NARANJA);
        System.out.println(nemo);

        Animal fish = nemo;
        System.out.println(fish);

        Object obj = fish;
        System.out.println(obj);


        /*
            Override (sobrescritura)
         */

        // alimentos de animales
        imprimirAlimentos(male);

        // alimentos de humanos
        imprimirAlimentos(human);

        // alimentos de perros
        imprimirAlimentos(terrier);

        // alimentos de peces
        imprimirAlimentos(nemo);

    }

    public static void imprimirAlimentos(Animal animal) {
        System.out.println("alimentos de " + animal.getClass().getSimpleName());
        for (String alimento : animal.aliments()) {
            System.out.println(alimento);
        }
        System.out.println("-------------------");
    }
}
