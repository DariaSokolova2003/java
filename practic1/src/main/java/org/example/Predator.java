package org.example;

abstract class Predator implements Animal {
    private Type type;
    private String name;
    private String voice;
    public Predator (String name)
    {
        this.name =name;
        this.type = Type.Predator;
    }

    @Override
    public String toString() {
        return  "name = '" + name +
                "', type = '" + type + '\'' ;

    }
     @Override
    public String getVoice() {
        return voice ;
    }

    @Override
    public String getName() {
        return name;
    }
    public Type getType() {
        return type;
    }
}

