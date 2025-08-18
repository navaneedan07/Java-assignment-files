import java.util.*;

class StringCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println("Compressed string: ");
            return;
        }

        char ch = input.charAt(0);
        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            } else {
                compressedString.append(ch).append(count);
                ch = input.charAt(i);
                count = 1;
            }
        }

        compressedString.append(ch).append(count);

        if(compressedString.length()<input.length())
            System.out.println("Compressed string: " + compressedString);
        else
            System.out.println("Compressed string: "+ input);
    }
}
