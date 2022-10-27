 package org.example;

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.Set;

 public class zoo {
     int counter_of_cages  ;

    private ArrayList<cage> cages = new ArrayList<>();
    private Set<String> Unique_kind_zoo = new HashSet();


    public zoo(int number_of_cages){
        for (int i=0; i<number_of_cages; i++)
        {
            cage new_cage = new cage();
            cages.add(new_cage);
        }
        counter_of_cages = number_of_cages;

    }

     public ArrayList<cage> getCages() {
         return cages;
     }
     public void new_cage(){
         cage new_cage = new cage();
         cages.add(new_cage);
         counter_of_cages++;
     }
     public int getLen(){ return counter_of_cages; };


     public String Kinds_in_the_zoo(){
        Set <String>  Set_kind = new HashSet<>();
         for(cage cage: cages) {
            for(Animal animal: cage.getAnimals_in_this_cage()) {
                Set_kind.add(animal.getKind());
            }
         }
         System.out.println("Виды животных в зоопарке:");
         return Set_kind.toString();

     }
     public void Count_of_herbivores_and_predators(){
         HashMap<String, Type> Map = new HashMap<>();
         int herbivores =0, predators=0;
         for(cage cage: cages) {
             for(Animal animal: cage.getAnimals_in_this_cage()) {
                 Map.put(animal.getName(), animal.getType());
             }
         }
             for (Type type: Map.values()){
                 if (type == Type.Predator){
                     predators++;
                 }
                 else herbivores++;
             }

         System.out.println("Predators:" + predators + '\n' + "Herbivores:" + herbivores );
    }
 }
