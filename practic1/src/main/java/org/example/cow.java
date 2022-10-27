package org.example;
public class cow extends Herbivore {

    private  String voice, kind;
    public cow( String name) {
        super(name);
        this.kind = "корова";
        this.voice = "МУУУУ";
    }
    public String getKind() {
        return "корова" ;
    }
    @Override
    public String toString() {
        return super.toString()+
                ", kind = '" + kind + '\'' +
                ", voice = '"+ voice + '\''+'\n';

    }

}

