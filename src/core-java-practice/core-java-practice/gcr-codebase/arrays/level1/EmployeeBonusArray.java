import java.util.Scanner;

class EmployeeBonusArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        int[] years = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for(int i = 0; i < 10; i++) {

            System.out.println("Enter Salary and Years of Service for Employee " + (i + 1));

            salary[i] = sc.nextDouble();
            years[i] = sc.nextInt();

            if(salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid Input! Enter Again");
                i--;
                continue;
            }
        }

        for(int i = 0; i < 10; i++) {

            if(years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            }
            else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Details");

        for(int i = 0; i < 10; i++) {
            System.out.println(
                    "Employee " + (i + 1) +
                            " Old Salary = " + salary[i] +
                            " Bonus = " + bonus[i] +
                            " New Salary = " + newSalary[i]
            );
        }

        System.out.println("\nTotal Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}