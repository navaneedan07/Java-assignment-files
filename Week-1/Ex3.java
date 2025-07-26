import java.util.*;
class Ex3 {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight (kg) and height (metres) : ");
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight/(height*height);
        boolean status;
        if(bmi>=18.5&&bmi<25) {
            status=true;
        }
        else {
            status=false;
        }
        System.out.println("BMI : "+bmi);
        if(status)
            System.out.println("BMI status : Normal");
        else
            System.out.println("BMI status : Abnormal");
    }
}