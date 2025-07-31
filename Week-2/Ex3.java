import java.util.*;
class LoginFailure {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        Scanner sc = new Scanner(System.in);
        int failureCount = 0;
        while(true) {
            System.out.println("Enter user name( or 'exit' )");
            String userName = sc.nextLine();
            if(userName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Enter password : ");
            String password = sc.nextLine();
            if(!userName.equals("admin")&&!password.equals("secret")) {
                failureCount++;
            }
            else {
                System.out.println("Login successful");
                break;
            }
        }
        System.out.println("Total number of non-admin login failures : "+failureCount);
    }
}