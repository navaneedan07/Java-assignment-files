import java.util.*;
class Ex4 {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557\n");
        int s1,s2,s3;
        double tot,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three subject marks : ");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        tot=(double)(s1+s2+s3);
        avg=tot/3;
        char grade='A';
        boolean status;
        if(s1>=50&&s2>=50&&s3>=50) {
            status = true;
            if (avg >= 90)
                grade = 'S';
            else if (avg >= 80)
                grade = 'A';
            else if (avg >= 70)
                grade = 'B';
            else if (avg >= 60)
                grade = 'C';
            else if (avg >= 50)
                grade = 'D';
        }
        else {
            grade = 'U';
            status = false;
        }
        System.out.println("Total : "+tot+"\nAverage : "+avg+"\nGrade : "+grade+"\nPass status : "+status);

    }
}