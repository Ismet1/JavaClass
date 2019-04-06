package com.class17;


public class Main {

	String name,breed,color,behavior,behavior1,behavior2;
    
    
    void bark() {
        System.out.println(name+" can "+behavior);
    }
    void run() {
    System.out.println(name+" can "+behavior1);
    }
    void play() {
    System.out.println(name+" can "+behavior2);
    }

public static void main(String[] args) {
    Main Husky=new Main();
    Husky.name="Husky";
    Husky.breed="Husky";
    Husky.color="White";
    Husky.behavior="bark";
    Husky.behavior1="run";
    Husky.behavior2="play";
    Husky.bark();
    Husky.run();
    Husky.play();
    
    Main d2=new Main();
    d2.name="Bulldog";
    d2.breed="Bulldog";
    d2.color="Black"; 
    d2.behavior="bark";
    d2.behavior1="run";
    d2.behavior2="play";
    d2.bark();
    d2.run();
    d2.play();
    
    Main d3=new Main();
    d3.name="Labrador";
    d3.breed="Labrador";
    d3.color="Brown"; 
    d3.behavior="bark";
    d3.behavior1="run";
    d3.behavior2="play";
    d3.bark();
    d3.run();
    d3.play();
}

}
