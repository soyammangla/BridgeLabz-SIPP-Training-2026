import java.util.Scanner;

class NaturalNumberSumFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using for loop = " + sum);
        System.out.println("Sum using formula = " + formulaSum);
        System.out.println("Both are equal = " + (sum == formulaSum));
    }
}