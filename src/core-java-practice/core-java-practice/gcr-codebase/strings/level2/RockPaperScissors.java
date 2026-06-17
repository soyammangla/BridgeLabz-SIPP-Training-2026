import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";

        return "Scissors";
    }

    public static String findWinner(
            String user,
            String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock") &&
                computer.equals("Scissors")) ||

                (user.equals("Paper") &&
                        computer.equals("Rock")) ||

                (user.equals("Scissors") &&
                        computer.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Games: ");
        int n = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println(
                "\nGame\tUser\tComputer\tWinner");

        for (int i = 1; i <= n; i++) {

            System.out.print(
                    "\nEnter Rock/Paper/Scissors : ");

            String user = sc.next();

            String computer = computerChoice();

            String winner =
                    findWinner(user, computer);

            if (winner.equals("User"))
                userWins++;

            if (winner.equals("Computer"))
                computerWins++;

            System.out.println(
                    i + "\t" +
                            user + "\t" +
                            computer + "\t\t" +
                            winner);
        }

        double userPercent =
                (userWins * 100.0) / n;

        double compPercent =
                (computerWins * 100.0) / n;

        System.out.println("\nUser Wins : "
                + userWins);

        System.out.println("Computer Wins : "
                + computerWins);

        System.out.println("User % : "
                + Math.round(userPercent * 100) / 100.0);

        System.out.println("Computer % : "
                + Math.round(compPercent * 100) / 100.0);

        sc.close();
    }
}