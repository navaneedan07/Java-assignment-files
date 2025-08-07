class University{

    String universityName;

    University(String universityName) {
        this.universityName = universityName;
    }

    public class Professor {
        String name;
        int experienceInYears;

        void setProfessor(String name, int experienceInYears) {
            this.name = name;
            this.experienceInYears = experienceInYears;
        }

        void display() {
            System.out.println("Name : " + name + "\nExperience in years : " + experienceInYears +  "\n");
        }
    }

    private class Student {
        String name;
        int rollNumber;
        String department;

        void setStudent(String name, int rollNumber, String department) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.department = department;
        }
        void display() {
            System.out.println("Name : " + name + "\nRoll Number : " + rollNumber + "\nDepartment : " + department + "\n");
        }
    }

    void setStudent() {
        Student s1 = new Student();
        s1.setStudent("Naveen",15,"CSE");

        s1.display();
    }
}

class UniversityTest {
    public static void main(String[] args) {
        University u = new University("Anna University");
        System.out.println("University name : " + u.universityName);
        University.Professor p1 = u.new Professor(); //Public works fine outside
        System.out.println("---Professor---");
        p1.setProfessor("Saul",15);
        p1.display();

        // University.Student s1 = u.new Student(); //Inaccessible outside
        System.out.println("---Student---");
        u.setStudent();
    }
}
