class ParameterizedConstructor {
    
    int a,b,c;

    ParameterizedConstructor() {
        System.out.println("Default constructor");
    }

    ParameterizedConstructor(int a) {
        System.out.println("Single parameterized constructor");
        this.a = a;
    }

    ParameterizedConstructor(int b,int c) {
        System.out.println("Double parameterized constructor");
        this.b = b;
        this.c = c;
    }

    void display() {
        System.out.println("a = "+a+"\nb = "+b+"\nc = "+c+"\n");
    }

    public static void main(String[] args) {

        ParameterizedConstructor obj1 = new ParameterizedConstructor();
        ParameterizedConstructor obj2 = new ParameterizedConstructor(10);
        ParameterizedConstructor obj3 = new ParameterizedConstructor(20,30);
        
        obj1.display();
        obj2.display();
        obj3.display();

    }
}
