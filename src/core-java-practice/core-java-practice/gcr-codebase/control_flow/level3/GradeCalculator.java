import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        double percentage =
                (physics + chemistry + maths) / 3;

        char grade;
        String remark;

        if(percentage >= 90) {
            grade = 'A';
            remark = "Excellent";
        }
        else if(percentage >= 75) {
            grade = 'B';
            remark = "Good";
        }
        else if(percentage >= 60) {
            grade = 'C';
            remark = "Average";
        }
        else if(percentage >= 40) {
            grade = 'D';
            remark = "Pass";
        }
        else {
            grade = 'F';
            remark = "Fail";
        }

        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
        System.out.println("Remark = " + remark);
    }
}