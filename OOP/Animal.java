class animal {
    String name;
    void eat(){
        System.out.println("The "+ name + "  is eating ");
    }
    
}
class Dog extends animal{
    void bark(){
        System.out.println("void bark()");
    }

}
public class Animal{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name="bob";
        System.out.println(dog.name);
        dog.eat();
        dog.bark();
    }
}