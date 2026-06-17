import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate exception
    public static void generateException(String[] names) {

        System.out.println(names[names.length]);
    }

    // Method to handle exception
    public static void handleException(String[] names) {

        try {

            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException Handled");

        } catch (RuntimeException e) {

            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        System.out.println("Enter Names:");

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // generateException(names);

        handleException(names);

        sc.close();
    }
}