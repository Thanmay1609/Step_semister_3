package string.assigment_problems;

import java.util.Scanner;

public class Q2 {

    static void checkTypingAccuracy(String original, String typed) {
        int length = original.length();
        int matchedCount = 0;
        int firstMismatchPosition = -1;
        char originalCharAtMismatch = ' ';
        char typedCharAtMismatch = ' ';

        for (int i = 0; i < length; i++) {
            char originalChar = original.charAt(i);
            char typedChar = typed.charAt(i);

            if (originalChar == typedChar) {
                matchedCount++;
            } else {
                if (firstMismatchPosition == -1) {
                    firstMismatchPosition = i + 1;
                    originalCharAtMismatch = originalChar;
                    typedCharAtMismatch = typedChar;
                }
            }
        }

        double accuracy = ((double) matchedCount / length) * 100;

        if (firstMismatchPosition == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matchedCount, length, accuracy);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matchedCount, length, accuracy, firstMismatchPosition,
                    originalCharAtMismatch, typedCharAtMismatch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original passage: ");
        String original = sc.nextLine();

        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();

        if (original.length() != typed.length()) {
            System.out.println("Error: Both strings must be of equal length.");
        } else {
            checkTypingAccuracy(original, typed);
        }

        sc.close();
    }
}
