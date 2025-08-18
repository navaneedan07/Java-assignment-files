import java.util.Scanner;

class VersionComparator {
    public static String compareVersions(String v1, String v2) {
        String[] parts1 = v1.split("\\.");
        String[] parts2 = v2.split("\\.");

        int len = Math.max(parts1.length, parts2.length);
        for (int i = 0; i < len; i++) {
            int num1 = i < parts1.length ? Integer.parseInt(parts1[i]) : 0;
            int num2 = i < parts2.length ? Integer.parseInt(parts2[i]) : 0;

            if (num1 > num2) return v1 + " is greater than " + v2;
            if (num1 < num2) return v1 + " is less than " + v2;
        }
        return v1 + " is equal to " + v2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter version 1: ");
        String version1 = scanner.nextLine();
        System.out.println("Enter version 2: ");
        String version2 = scanner.nextLine();
        System.out.println(compareVersions(version1, version2));
    }
}