import java.util.*;
class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        System.out.println("Enter 3x3 matrix : ");
        int rowSum[] = new int[3];
        for(int i=0;i<3;i++) {
            rowSum[i]=0;
            for(int j=0;j<3;j++) {
                matrix[i][j] = sc.nextInt();
                rowSum[i]+=matrix[i][j];
            }
        }
        for(int i=0;i<3;i++) {
            System.out.println("Row "+(i+1)+" sum : "+rowSum[i]);
        }
        int max = rowSum[0];
        int index=0;
        for(int i=1;i<rowSum.length;i++) {
            if(rowSum[i]>max) {
                max = rowSum[i];
                index=i;
            }
        }
        System.out.println("Highest sum : "+max+"\nRow number with the highest sum : "+(index+1));
    }
}