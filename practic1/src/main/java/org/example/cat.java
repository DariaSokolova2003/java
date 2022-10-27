package org.example;
public class cat extends Predator {

    private  String voice, kind;
    public cat(String name) {
        super(name);
        this.kind = "кот";
        this.voice = "МЯУ";
    }

    public String getKind() {
        return "кот" ;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", kind = '" + kind + '\'' +
                ", voice = '"+ voice + '\''+'\n';


    }

}

