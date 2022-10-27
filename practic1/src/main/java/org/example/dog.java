package org.example;
public class dog extends Predator {

    private  String voice, kind;
    public dog( String name) {
        super(name);
        this.kind = "собака";
        this.voice = "ГАВ";
    }
    public String getKind() {
        return "собака" ;
    }
    @Override
    public String toString() {
        return super.toString()+
                ", kind = '" + kind + '\'' +
                ", voice = '"+ voice + '\''+'\n';


    }

}
