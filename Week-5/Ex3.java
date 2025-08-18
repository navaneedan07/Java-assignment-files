import java.util.Scanner;

class LetterOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();
        char[] characters = input.toCharArray();
        int[] occurrences = new int[26];
        for (char c : characters) {
            if (Character.isLetter(c)) {
                occurrences[Character.toLowerCase(c) - 'a']++;
            }
        }
        System.out.println("Letter occurrences:");
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + occurrences[i]);
            }
        }
    }
}
