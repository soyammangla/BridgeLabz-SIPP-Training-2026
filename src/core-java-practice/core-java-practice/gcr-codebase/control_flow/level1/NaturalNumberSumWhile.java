import java.util.Scanner;

class NaturalNumberSumWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int sum = 0;
        int i = 1;

        while(i <= n) {
            sum += i;
            i++;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using while loop = " + sum);
        System.out.println("Sum using formula = " + formulaSum);
        System.out.println("Both are equal = " + (sum == formulaSum));
    }
}