 package org.example;
 import java.util.ArrayList;
 public class cage {
     ArrayList<Animal> animals_in_this_cage =new ArrayList<Animal>();
     private int count;
     public boolean Is_full() {
         return (count==4);
     }
     public cage() {
        count =0;
     }
     public cage(Animal animal) {
        count++;
         animals_in_this_cage.add(animal);
     }

     public ArrayList<Animal> getAnimals_in_this_cage() {
         return animals_in_this_cage;
     }

     public boolean Equal_types(Animal animal){
         return (animals_in_this_cage.get(count - 1).getType()==animal.getType());
     }

     public void setAnimal_in_cage(Animal animal) throws Exception {
         if (Is_full()) {
             throw new Exception("Cage is full");
         }
         else {
             if (count==0) {
                 count++;
                 animals_in_this_cage.add(animal);
             }
                else if (Equal_types(animal))
                {
                    count++;
                    animals_in_this_cage.add(animal);
                }
                    else {throw new Exception("Types of animals must be equal");}
             }
         }

     public String View_Animal() {
         if (count>0) {
             return animals_in_this_cage.toString()+ '\n';
         }
         else return "клетка пуста\n";
     }
 }

