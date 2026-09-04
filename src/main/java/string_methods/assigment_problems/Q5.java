package string_methods.assigment_problems;

import java.util.Scanner;

public class Q5 {

    static void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        String cleaned = feedback.toLowerCase();
        cleaned = cleaned.replace(",", "");
        cleaned = cleaned.replace(".", "");

        String[] words = cleaned.split("\\s+");

        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.isEmpty()) {
                continue;
            }

            boolean isStopWord = false;
            for (int j = 0; j < stopWords.length; j++) {
                if (word.equals(stopWords[j])) {
                    isStopWord = true;
                    break;
                }
            }

            if (isStopWord) {
                continue;
            }

            int existingIndex = -1;
            for (int k = 0; k < uniqueCount; k++) {
                if (uniqueWords[k].equals(word)) {
                    existingIndex = k;
                    break;
                }
            }

            if (existingIndex != -1) {
                counts[existingIndex]++;
            } else {
                uniqueWords[uniqueCount] = word;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = 0; j < uniqueCount - 1 - i; j++) {
                if (counts[j] < counts[j + 1]) {
                    int tempCount = counts[j];
                    counts[j] = counts[j + 1];
                    counts[j + 1] = tempCount;

                    String tempWord = uniqueWords[j];
                    uniqueWords[j] = uniqueWords[j + 1];
                    uniqueWords[j + 1] = tempWord;
                }
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueWords[i] + ": " + counts[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feedback: ");
        String feedback = sc.nextLine();

        printFilteredWordFrequency(feedback);

        sc.close();
    }
}
