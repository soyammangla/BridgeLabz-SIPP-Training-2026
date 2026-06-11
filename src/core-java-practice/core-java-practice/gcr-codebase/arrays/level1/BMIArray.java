import java.util.Scanner;

class BMIArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];

        String[] status = new String[n];

        for(int i = 0; i < n; i++) {

            System.out.println("Enter Weight and Height");

            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++) {

            double heightMeter = height[i] / 100.0;

            bmi[i] = weight[i] /
                    (heightMeter * heightMeter);

            if(bmi[i] < 18.5) {
                status[i] = "Underweight";
            }
            else if(bmi[i] < 25) {
                status[i] = "Normal";
            }
            else if(bmi[i] < 30) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details");

        for(int i = 0; i < n; i++) {

            System.out.println(
                    "Weight = " + weight[i] +
                            " Height = " + height[i] +
                            " BMI = " + bmi[i] +
                            " Status = " + status[i]
            );
        }
    }
}