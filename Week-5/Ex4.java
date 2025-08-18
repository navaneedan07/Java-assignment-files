import java.util.Scanner;

class CountWords {
    public static void main(String[] args) {
        System.out.println("Navaneedan S\n2024503557");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}
