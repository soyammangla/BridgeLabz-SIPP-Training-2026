import java.util.Scanner;

public class VotingElgibility {

    public static int[] generateAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 1;
        }

        return ages;
    }

    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void display(String[][] arr) {

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(
                    arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);

        String[][] result = checkVoting(ages);

        display(result);

        sc.close();
    }
}