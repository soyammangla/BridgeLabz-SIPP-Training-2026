import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number < 0) {
            System.out.println("Factorial not possible");
            return;
        }

        long factorial = 1;
        int i = 1;

        while(i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial = " + factorial);
    }
}