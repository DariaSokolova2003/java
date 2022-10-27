package org.example;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        zoo My_Zoo = new zoo(4);
        Visiter My_Visiter = new Visiter();

        dog _dog = new dog("Шарик");
        cat _cat = new cat("Барсик");
        cat __cat = new cat("Мурзик");
        dog __dog = new dog("Мартин");
        dog ___dog = new dog("Альма");
        dog ____dog = new dog("Полкан");
        cow _cow = new cow("Ночка");
        owl _owl = new owl("Аркадий");
        cow __cow = new cow("Бурёнка");

        try {
            My_Zoo.getCages().get(0).setAnimal_in_cage(_cow);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            My_Zoo.getCages().get(0).setAnimal_in_cage(_cat);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            My_Zoo.getCages().get(2).setAnimal_in_cage(_dog);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            My_Zoo.getCages().get(2).setAnimal_in_cage(__dog);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            My_Zoo.getCages().get(2).setAnimal_in_cage(___dog);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            My_Zoo.getCages().get(2).setAnimal_in_cage(__cat);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            My_Zoo.getCages().get(2).setAnimal_in_cage(____dog);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            My_Zoo.getCages().get(3).setAnimal_in_cage(_owl);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        try {
            My_Zoo.getCages().get(3).setAnimal_in_cage(__cow);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println(My_Visiter.List(My_Zoo));
        System.out.println(My_Zoo.Kinds_in_the_zoo());
        System.out.println();
        My_Zoo.Count_of_herbivores_and_predators();
    }

}