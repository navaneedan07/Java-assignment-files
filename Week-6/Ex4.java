class LivingBeing {
    String name;
    LivingBeing(String name) {
        System.out.println("LivingBeing constructor invoked");
        this.name = name;
    }
    void breathe() {
        System.out.println(name+" is breathing");
    }
    void response() {
        System.out.println(name+" is responding");
    }
}
class LandAnimal extends LivingBeing {
    LandAnimal(String name) {
        super(name);
        System.out.println("LandAnimal constructor invoked");
    }
    void walk() {
        System.out.println(name+" is walking");
    }
    void numberOfLegs(int legs) {
        System.out.println(name+" has "+legs+ " legs");
    }
}
class WaterAnimal extends LivingBeing {
    WaterAnimal(String name) {
        super(name);
        System.out.println("WaterAnimal constructor invoked");
    }
    void swim() {
        System.out.println(name+" can swim");
    }
    void waterType(String waterType) {
        System.out.println(name+" is an "+waterType+" animal");
    }
}
class Dog extends LandAnimal {
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor invoked");
    }
    void bark() {
        System.out.println(name+" is barking");
    }
}
class Cat extends LandAnimal {
    Cat(String name) {
        super(name);
        System.out.println("Cat constructor invoked");
    }
    void meow() {
        System.out.println(name+" is meowing");
    }
}
class DifferentAnimalTest {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        Dog dog = new Dog("Puppy");
        dog.bark();
        Cat cat = new Cat("Kitty");
        cat.meow();

        LandAnimal landAnimal = new LandAnimal("Lion");
        landAnimal.walk();
        landAnimal.numberOfLegs(4);

        WaterAnimal fish = new WaterAnimal("Shark");
        fish.swim();
        fish.waterType("Marine");

    }
}