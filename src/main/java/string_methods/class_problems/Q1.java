package string_methods.class_problems;

import java.util.Scanner;

public class Q1 {

    static void countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));

            if (c == ' ') {
                continue;
            }

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if (c >= 'a' && c <= 'z') {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount + " | Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        countVowelsAndConsonants(text);

        sc.close();
    }
}
