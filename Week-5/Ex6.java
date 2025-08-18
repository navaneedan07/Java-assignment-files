import java.util.*;
class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input1 = sc.nextLine();
        System.out.println("Enter another string : ");
        String input2 = sc.nextLine();
        int arr[] = new int[26];
        int arr2[] = new int[26];
        if(input1.length()!=input2.length()) {
            System.out.println("Not an anagram");
            return;
        }
        for(int i=0;i<input1.length();i++) {
            if(Character.isLowerCase(input1.charAt(i)))
                arr[input1.charAt(i)-'a']++;
            else
                arr[input1.charAt(i)-'A']++;
            if(Character.isLowerCase(input2.charAt(i)))
                arr2[input2.charAt(i)-'a']++;
            else
                arr2[input2.charAt(i)-'A']++;
        }

        int i;
        for(i=0; i<26; i++) {
            if(arr[i]!=arr2[i]) {
                System.out.println("Not an anagram");
                return;
            }
        }

        System.out.println("It is an anagram");
    }
}
