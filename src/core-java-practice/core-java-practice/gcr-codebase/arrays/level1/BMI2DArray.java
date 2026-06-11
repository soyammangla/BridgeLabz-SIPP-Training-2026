import java.util.Scanner;

class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] personData = new double[n][3];

        String[] weightStatus = new String[n];

        for(int i = 0; i < n; i++) {

            System.out.println("Enter Weight");
            personData[i][0] = sc.nextDouble();

            System.out.println("Enter Height");
            personData[i][1] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++) {

            double heightMeter =
                    personData[i][1] / 100.0;

            personData[i][2] =
                    personData[i][0] /
                            (heightMeter * heightMeter);

            double bmi = personData[i][2];

            if(bmi < 18.5)
                weightStatus[i] = "Underweight";

            else if(bmi < 25)
                weightStatus[i] = "Normal";

            else if(bmi < 30)
                weightStatus[i] = "Overweight";

            else
                weightStatus[i] = "Obese";
        }

        for(int i = 0; i < n; i++) {

            System.out.println(
                    "Weight = " + personData[i][0]
                            + " Height = " + personData[i][1]
                            + " BMI = " + personData[i][2]
                            + " Status = " + weightStatus[i]
            );
        }
    }
}