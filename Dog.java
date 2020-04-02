package Lesson20.Lesson20Son;

import Lesson20.Animal;

public class Dog extends Animal {
    @Override
    public void greeting(){
        System.out.println("Woof!");
    }

    public void greeting(Dog another){
        System.out.println("Wooooooooof!");
    }
}
