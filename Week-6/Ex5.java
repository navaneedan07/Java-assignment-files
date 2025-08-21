// i. Trying to override with different return type (Compile-time error)
class Parent1 {
    public int getValue() { return 42; }
}
class Child1 extends Parent1 {
    // @Override
    // public String getValue() { return "Hello"; } // Invalid: incompatible return type
}

// ii. Trying to reduce visibility (Compile-time error)
class Parent2 {
    public void show() {}
}
class Child2 extends Parent2 {
    // private void show() {} // Invalid: cannot reduce visibility
}

// iii. Wrong overriding syntax (Not overriding, just overloading)
class Parent3 {
    public void greet() {
        System.out.println("Hello from Parent");
    }
}
class Child3 extends Parent3 {
    // @Override
    public void greet(String name) { // Overloading, not overriding
        System.out.println("Hello " + name + " from Child");
    }
}

// iv. Wrong overloading syntax (Duplicate method signature)
class OverloadTest {
    // int compute(int a) { return a; }
    // String compute(int a) { return String.valueOf(a); } // Invalid: same signature, different return type
}

// v. Covariant return type (Valid)
class Animal {}
class Dog extends Animal {}

class Parent4 {
    public Animal getAnimal() { return new Animal(); }
}
class Child4 extends Parent4 {
    @Override
    public Dog getAnimal() { return new Dog(); } // Covariant return type
}

// vi. Method Overloading (Same class and across classes)
class Overload {
    void display() {
        System.out.println("No args");
    }
    void display(String msg) {
        System.out.println("Message: " + msg);
    }
}
class OverloadChild extends Overload {
    void display(int number) {
        System.out.println("Number: " + number);
    }
}

// vii. Static Method Overloading
class StaticOverload {
    static void info() {
        System.out.println("Static method with no args");
    }
    static void info(String msg) {
        System.out.println("Static method with message: " + msg);
    }
}

// viii. Upcasting and Downcasting
class Parent5 {
    void speak() {
        System.out.println("Parent speaking");
    }
}
class Child5 extends Parent5 {
    void shout() {
        System.out.println("Child shouting");
    }
}

class Ex5 {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        // Safe upcasting
        Parent5 p = new Child5(); // Upcasting
        p.speak(); // Allowed
        // p.shout(); // Not allowed: Parent reference can't access Child method

        // Safe downcasting with instanceof
        if (p instanceof Child5) {
            Child5 c = (Child5) p;
            c.shout(); // Allowed
        }

        // Unsafe downcasting
        Parent5 p2 = new Parent5();
        p2.speak();
        // Child5 c2 = (Child5) p2; // Runtime error: ClassCastException
        // c2.shout();
    }
}