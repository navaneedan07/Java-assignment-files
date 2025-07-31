import java.util.*;
class Ex5 {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557\n");
        Scanner sc = new Scanner(System.in);
        double celsius,fahrenheit;
        System.out.println("Enter temperature (in Celsius) : ");
        celsius = sc.nextDouble();
        fahrenheit = (celsius*9/5)+32;
        boolean status;
        if(fahrenheit>100)
            status = true;
        else
            status = false;
        System.out.println("Temperature degree: "+fahrenheit+" fahrenheit ("+celsius+" celsius)");
        if(status)
            System.out.println("Temperature status : Hot");
        else
            System.out.println("Temperture status : Cold");
    }
}