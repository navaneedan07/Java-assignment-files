import java.util.Scanner;
class StudentAttendance {
    Scanner sc = new Scanner(System.in);
    int attendance[][] = new int[5][8];
    double dailyAttendancePercentage[] = new double[5];
    double weeklyAttendancePercentage;

    void getInfo() {
        for(int i=0;i<5;i++) {
            System.out.println("Enter 8-hour attendance for "+(i+1)+"th day(0 or 1) : ");
            for(int j=0;j<8;j++) {
                attendance[i][j] = sc.nextInt();
            }
        }
    }
    void dailyAttendance() {
        for(int i=0;i<5;i++) {
            int attendanceSum = 0;
            for(int j=0;j<8;j++) {
                if(attendance[i][j]==1) {
                    attendanceSum+=1;
                }
            }
            dailyAttendancePercentage[i]=(double)attendanceSum/8*100;
        }
    }
    void weeklyAttendance() {
        double attendanceSum=0;
        for(int i=0;i<5;i++) {
            attendanceSum+=dailyAttendancePercentage[i];
        }
        weeklyAttendancePercentage=attendanceSum/5;
    }
    void display() {
        System.out.println("Attendance percentage : ");
        for(int i=0;i<5;i++) {
            System.out.println("Day "+(i+1)+" attendance percentage : "+dailyAttendancePercentage[i]);
        }
        System.out.println("Weekly attendance percentage : "+weeklyAttendancePercentage);
    }
}
class Student {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        n = sc.nextInt();
        StudentAttendance s[] = new StudentAttendance[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter attendance for student "+(i+1));
            s[i] = new StudentAttendance();
            s[i].getInfo();
        }
        for(int i=0;i<n;i++) {
            s[i].dailyAttendance();
            s[i].weeklyAttendance();
            System.out.println("Student "+(i+1)+" details : ");
            s[i].display();
        }
    }
}
