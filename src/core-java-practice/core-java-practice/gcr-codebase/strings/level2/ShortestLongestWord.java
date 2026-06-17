import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitText(String text) {

        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
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

    public static int[] findShortestLongest(String[][] arr) {

        int shortest = Integer.parseInt(arr[0][1]);
        int longest = Integer.parseInt(arr[0][1]);

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            int len = Integer.parseInt(arr[i][1]);

            if (len < shortest) {
                shortest = len;
                shortestIndex = i;
            }

            if (len > longest) {
                longest = len;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] data = wordLength(words);

        int[] result = findShortestLongest(data);

        System.out.println("Shortest Word : "
                + data[result[0]][0]);

        System.out.println("Longest Word : "
                + data[result[1]][0]);

        sc.close();
    }
}