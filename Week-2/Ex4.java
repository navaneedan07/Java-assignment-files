import java.util.*;
class VaccineEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age>=18 && age<=65) {
            System.out.println("Eligible for vaccine");
            int appointmentNumber;
            System.out.println("Enter your 3-digit appointment number : ");
            appointmentNumber = sc.nextInt();
            if(appointmentNumber%2==0) {
                System.out.println("You are assigned priority slot");
            }
            else {
                System.out.println("You are assigned regular slot");
            }
            int lastDigit = appointmentNumber%10;
            switch(lastDigit) {
                case 1:
                    System.out.println("Gift : Pen");
                    break;
                case 2:
                    System.out.println("Gift : Mask");
                    break;
                case 3:
                    System.out.println("Gift : Sanitizer");
                    break;
                default:
                    System.out.println("No special gift");
            }
        }
        else {
            System.out.println("You are not eligible for vaccine");
        }
    } 
}