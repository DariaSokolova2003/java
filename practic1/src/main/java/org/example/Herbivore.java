package org.example;

abstract class Herbivore implements Animal {
        private Type type;
    private String name;
    private String voice;
        public Herbivore (String name)
        {
            this.name =name;

            this.type = Type.Herbivore;
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

  //  @Override
    public Type getType() {
        return type;
    }

}

