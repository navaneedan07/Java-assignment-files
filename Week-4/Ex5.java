import java.util.Random;
class  Student {
    Random rand = new Random();
    String name;
    int age;
    int rollNumber;
    
    Student() {
        rollNumber = rand.nextInt(99)+2001;
    }

    Student(String name,int age) {
        this.name = name;
        this.age = age;
        this();
    }

    void display() {
        System.out.println("Roll Number : "+rollNumber+"\nName : "+name+"\nAge : "+age+"\n");
    }

    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        Student s1 = new Student("Naveen", 18);
        Student s2 = new Student("Saul",24);
        s1.display();
        s2.display();
    }
}
