import java.util.*;
class Ex1 {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Enter operator : (+,-,*,/)");
        char c = sc.next().charAt(0);
        if (c == '+') {
            System.out.println("Sum : "+(a+b));
        }
        else if(c=='-') {
            System.out.println("Difference : "+Math.abs(a-b));
        }
        else if(c=='*') {
            System.out.println("Product : "+(a*b));
        }
        else if(c=='/') {
            System.out.println("Division : "+(a/b));
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}