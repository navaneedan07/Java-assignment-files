class StudentDetails {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
        this.display();
    }

    void display() {
        System.out.println("Name : "+name+"\nAge : "+age+"\n");
    }

    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        StudentDetails s1 = new StudentDetails();
        s1.setDetails("Naveen",18);
    }
}
