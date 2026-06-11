import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();

        long temp = number;

        int count = 0;

        while(temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        temp = number;

        int index = 0;

        while(temp != 0) {

            digits[index] = (int)(temp % 10);

            temp /= 10;
            index++;
        }

        int[] frequency = new int[10];

        for(int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit Frequencies");

        for(int i = 0; i < 10; i++) {

            if(frequency[i] > 0) {
                System.out.println(
                        i + " occurs " +
                                frequency[i] + " times"
                );
            }
        }
    }
}