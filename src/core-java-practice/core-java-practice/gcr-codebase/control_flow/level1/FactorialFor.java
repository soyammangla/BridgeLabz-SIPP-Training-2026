import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number < 0) {
            System.out.println("Factorial not possible");
            return;
        }

        long factorial = 1;

        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);
    }
}