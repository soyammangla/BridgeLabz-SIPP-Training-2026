package core;

public class FirstOccurrence {
    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int index = haystack.indexOf(needle);

        System.out.println(index);
    }
}