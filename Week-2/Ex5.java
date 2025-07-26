import java.util.*;
class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        str = new String(str.toLowerCase());
        char array[] = str.toCharArray();
        int vowelCount[] = {0,0,0,0,0};
        for(int i=0;i<array.length;i++) {
            switch(array[i]) {
                case 'a':
                    vowelCount[0]++;
                    break;
                case 'e':
                    vowelCount[1]++;
                    break;
                case 'i':
                    vowelCount[2]++;
                    break;
                case 'o' :
                    vowelCount[3]++;
                    break;
                case 'u' :
                    vowelCount[4]++;
                    break;
            }
        }
        char vowel[] = {'a','e','i','o','u'};
        for(int i=0;i<5;i++) {
            System.out.println("Frequency of '"+vowel[i]+"' : "+vowelCount[i]);
        }
    }
}