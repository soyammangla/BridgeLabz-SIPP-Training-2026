import java.util.Scanner;

public class WordLength2DArray {

    public static String[] splitText(String text) {

        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];

        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }

        words[index] = temp;

        return words;
    }

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] wordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);

        String[][] result = wordLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    result[i][0] + "\t" +
                            Integer.parseInt(result[i][1]));
        }

        sc.close();
    }
}