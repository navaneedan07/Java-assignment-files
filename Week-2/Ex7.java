import java.util.*;
class TrafficLight {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter traffic light color : ");
        String color = sc.nextLine().toLowerCase();
        switch(color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready to move");
                break;
            case "green":
                System.out.println("Go");
                break;
            default :
                System.out.println("Invalid color");
        }
    }
}