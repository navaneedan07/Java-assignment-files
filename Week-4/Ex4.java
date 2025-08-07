class StudentDetails {
    String name;
    int rollNumber;

    void setStudentDetails(String name,int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber; 
    }

    StudentDetails copyStudentDetails(StudentDetails s) {
        StudentDetails s3 = new StudentDetails();
        s3.name = s.name;
        s3.rollNumber = s.rollNumber;
        return s3;
    }

    void display() {
        System.out.println("Name : "+name+"\nRoll Number : "+rollNumber);
    }

    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        StudentDetails s1 = new StudentDetails();
        s1.setStudentDetails("Naveen", 2001);

        StudentDetails s2 = new StudentDetails();
        s2.setStudentDetails("Saul",2002);

        StudentDetails s3 = s1.copyStudentDetails(s2); //Copy s2 to s3
        s3.display();

    }
    
}
