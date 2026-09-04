package string.assigment_problems;

import java.util.Scanner;

public class Q3 {

    static void findLongestStreak(String signalLog) {
        int currentStreakLength = 1;
        char currentStreakChar = signalLog.charAt(0);

        int maxStreakLength = 1;
        char maxStreakChar = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {
            char c = signalLog.charAt(i);

            if (c == currentStreakChar) {
                currentStreakLength++;
            } else {
                currentStreakChar = c;
                currentStreakLength = 1;
            }

            if (currentStreakLength > maxStreakLength) {
                maxStreakLength = currentStreakLength;
                maxStreakChar = currentStreakChar;
            }
        }

        System.out.println("Longest Streak: '" + maxStreakChar + "' repeated " + maxStreakLength + " times");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine();

        findLongestStreak(signalLog);

        sc.close();
    }
}
