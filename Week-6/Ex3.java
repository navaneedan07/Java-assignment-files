class Animal {
    void move(String direction) {
        System.out.println("Animal is moving towards "+direction);
    }
    void move(int distance) {
        System.out.println("Animal is moving "+distance+"kms");
    }
    void move(String direction, int distance) {
        System.out.println("Animal is moving "+distance+"kms towards "+direction);
    }
}
class Dog extends Animal{
    @Override
    void move(String direction) {
        System.out.println("Dog is moving towards "+direction);
    }
    @Override
    void move(int distance) {
        System.out.println("Dog is moving "+distance+"kms");
    }
    @Override
    void move(String direction, int distance) {
        System.out.println("Dog is moving "+distance+"kms towards "+direction);
    }
}
class Cat extends Animal {
    @Override
    void move(String direction) {
        System.out.println("Cat is moving towards "+direction);
    }
    @Override
    void move(int distance) {
        System.out.println("Cat is moving "+distance+"kms");
    }
    @Override
    void move(String direction, int distance) {
        System.out.println("Cat is moving "+distance+"kms towards "+direction);
    }
}
class Bird extends Animal{
    @Override
    void move(String direction) {
        System.out.println("Bird is moving towards "+direction);
    }
    @Override
    void move(int distance) {
        System.out.println("Dog is moving "+distance+"kms");
    }
    @Override
    void move(String direction, int distance) {
        System.out.println("Bird is moving "+distance+"kms towards "+direction);
    }
}
class AnimalTypeTest {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        Animal[] animals = { new Dog(),new Cat(),new Bird() };
        for (int i = 0; i < animals.length; i++) {
            animals[i].move("North");
            animals[i].move(5);
            animals[i].move("West",10);
        }
        Dog dog = new Dog();
        dog.move("South");
        dog.move(20);
        dog.move("East",25);
    }
}