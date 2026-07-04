package Polymorphism;
class Animal {
    String name;
    void sound(){
        System.out.println("The "+ name + " is making sound");
    }
    
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog is barking");
    }

}
class Cat extends Animal{
    void sound(){
        System.out.println("cat is purring");
    }

}
public class AnimalPolymorphism {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog(),
            new Cat()
        };

        for (Animal a : animals) {
            a.sound();
        }
    }
}
