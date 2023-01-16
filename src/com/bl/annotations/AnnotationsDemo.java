package com.bl.annotations;

public class AnnotationsDemo {
    public static void main(String[] args) {
        Animal c = new cat();
        Animal h = new Human();
        h.anything();
        c.anything();
    }
}
class Animal{
    public void anything(){
        System.out.println("Doing stuff");
    }
}
class Human extends Animal{
    @Override
    public void anything(){
        System.out.println("Reading ");
    }
}
class cat extends Human{
    @Deprecated
    public void anything(){
        System.out.println("Sleeping");
    }
}