package org.example;
public class owl extends Predator {
 private  String voice, kind;
   public owl( String name) {
       super(name);
       this.kind = "сова";
         this.voice = "УГУХ";
     }

    public String getKind() {
        return "сова" ;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", kind = '" + kind + '\'' +
                ", voice = '"+ voice + '\'' +'\n';

    }
}

