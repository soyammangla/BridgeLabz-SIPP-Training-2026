import java.util.Scanner;

class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] marks = new double[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

        for(int i = 0; i < n; i++) {

            System.out.println("Enter Physics, Chemistry and Maths Marks");

            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            if(marks[i][0] < 0 ||
                    marks[i][1] < 0 ||
                    marks[i][2] < 0) {

                System.out.println("Invalid Marks");
                i--;
            }
        }

        for(int i = 0; i < n; i++) {

            percentage[i] =
                    (marks[i][0] +
                            marks[i][1] +
                            marks[i][2]) / 3;

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
                    "Physics = " + marks[i][0] +
                            " Chemistry = " + marks[i][1] +
                            " Maths = " + marks[i][2] +
                            " Percentage = " + percentage[i] +
                            " Grade = " + grade[i]
            );
        }
    }
}