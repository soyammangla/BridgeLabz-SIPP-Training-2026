import java.util.Scanner;

class StudentGradeArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for(int i = 0; i < n; i++) {

            System.out.println("Enter Physics, Chemistry and Maths Marks");

            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();

            if(physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid Marks! Enter Again");
                i--;
            }
        }

        for(int i = 0; i < n; i++) {

            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3;

            if(percentage[i] >= 90)
                grade[i] = 'A';
            else if(percentage[i] >= 75)
                grade[i] = 'B';
            else if(percentage[i] >= 60)
                grade[i] = 'C';
            else if(percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        System.out.println("\nStudent Report");

        for(int i = 0; i < n; i++) {

            System.out.println(
                    "Student " + (i + 1) +
                            " Physics = " + physics[i] +
                            " Chemistry = " + chemistry[i] +
                            " Maths = " + maths[i] +
                            " Percentage = " + percentage[i] +
                            " Grade = " + grade[i]
            );
        }
    }
}