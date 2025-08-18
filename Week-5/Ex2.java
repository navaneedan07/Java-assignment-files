import java.util.Scanner;

class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        int i = 0;
        while (i < chars.length / 2) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
            i++;
        }
        String reversed = new String(chars);
        System.out.println("Reversed string: " + reversed);
    }
}
