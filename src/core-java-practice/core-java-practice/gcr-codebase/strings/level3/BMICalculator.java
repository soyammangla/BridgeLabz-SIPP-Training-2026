import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status
    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100.0;

        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        bmi = Math.round(bmi * 100.0) / 100.0;

        return new String[]{
                String.valueOf(weight),
                String.valueOf(heightCm),
                String.valueOf(bmi),
                status
        };
    }

    // Method to generate BMI table
    public static String[][] generateReport(double[][] data) {

        String[][] report = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            String[] result =
                    calculateBMI(data[i][0], data[i][1]);

            report[i] = result;
        }

        return report;
    }

    // Display Method
    public static void display(String[][] report) {

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < report.length; i++) {

            System.out.println(
                    report[i][0] + "\t" +
                            report[i][1] + "\t" +
                            report[i][2] + "\t" +
                            report[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] report = generateReport(persons);

        display(report);

        sc.close();
    }
}