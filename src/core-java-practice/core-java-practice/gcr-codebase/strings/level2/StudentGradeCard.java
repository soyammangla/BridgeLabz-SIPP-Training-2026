import java.util.Scanner;

public class StudentGradeCard {

    public static int[][] generateMarks(int n) {

        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {

            marks[i][0] =
                    (int)(Math.random() * 101);

            marks[i][1] =
                    (int)(Math.random() * 101);

            marks[i][2] =
                    (int)(Math.random() * 101);
        }

        return marks;
    }

    public static double[][] calculateResult(
            int[][] marks) {

        double[][] result =
                new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total =
                    marks[i][0] +
                            marks[i][1] +
                            marks[i][2];

            double average = total / 3.0;

            double percentage =
                    (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(
                    average * 100) / 100.0;

            result[i][2] = Math.round(
                    percentage * 100) / 100.0;
        }

        return result;
    }

    public static String grade(double percentage) {

        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";

        return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number of Students: ");

        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        double[][] result =
                calculateResult(marks);

        System.out.println(
                "\nPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < n; i++) {

            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            (int)result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grade(result[i][2]));
        }

        sc.close();
    }
}