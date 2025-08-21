class LivingBeing {
    void breath() {
        System.out.println("Living being is breathing");
    }
    void response() {
        System.out.println("Living being is responding");
    }
}
class Animal extends LivingBeing {
    void walk() {
        System.out.println("Animal is walking");
    }
    void noOfLegs(int legs) {
        System.out.println("I have "+legs+" legs");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
    @Override
    void walk() {
        System.out.println("Cat is walking");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
    @Override
    void walk() {
        System.out.println("Dog is walking");
    }
}
class AnimalTest {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        Animal cat = new Cat();
        cat.walk();
        Animal dog = new Dog();  
        dog.walk();
        Cat c1 = new Cat();
        c1.meow();
        Dog d1 = new Dog();
        d1.bark();
    }
}