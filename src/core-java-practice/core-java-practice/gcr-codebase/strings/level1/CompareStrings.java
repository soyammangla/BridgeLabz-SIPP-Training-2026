import java.util.Scanner;

public class CompareStrings {

    // User-defined method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // User-defined comparison
        boolean userResult = compareStrings(str1, str2);

        // Built-in comparison
        boolean builtInResult = str1.equals(str2);

        System.out.println("Using charAt() method: " + userResult);
        System.out.println("Using equals() method: " + builtInResult);

        if (userResult == builtInResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}