package org.example;

public class Visiter
{

    public String List(zoo My_Zoo){
        String str = " ";
        for (int i=0; i< My_Zoo.getLen(); i++)
        {
            str += My_Zoo.getCages().get(i).View_Animal();
        }

        return   str;
}


}
