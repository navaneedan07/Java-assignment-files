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
        System.out.println("Animal has "+legs+" legs");
    }
}
class LivingBeingTest {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        Animal dog = new Animal();
        dog.breath();
        dog.response();
        dog.walk();
        dog.noOfLegs(4);
    }
}