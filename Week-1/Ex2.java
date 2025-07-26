import java.util.*;
class Ex2 {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter runs, fouls : ");
        int runs = sc.nextInt();
        byte fouls = sc.nextByte();
        boolean status;
        if(runs>=50&&fouls<=5)
            status = true;
        else
            status = false;
        System.out.println("Runs : "+runs+"\nFouls : "+fouls+"\nWinning status : "+status);
    }
}