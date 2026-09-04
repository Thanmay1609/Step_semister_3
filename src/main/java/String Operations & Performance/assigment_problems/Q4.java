import java.util.Scanner;

public class Q4 {

    static String normalizeCode(String raw) {
        String trimmed = raw.trim();

        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }

        String pubCode = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);

        return pubCode + rest;
    }

    static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }

        String pubCode = code.substring(0, 3);
        String body = code.substring(3);

        for (int i = 0; i < pubCode.length(); i++) {
            if (!Character.isLetter(pubCode.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                return "Invalid: remaining characters must be digits";
            }
        }

        String year = body.substring(0, 4);
        String catalog = body.substring(4);

        StringBuilder sb = new StringBuilder();
        sb.append("[").append(pubCode).append("] YEAR: ");
        sb.append(year).append(" | CATALOG: ").append(catalog);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        String raw = sc.nextLine();

        String normalized = normalizeCode(raw);
        System.out.println(validateAndFormat(normalized));

        sc.close();
    }
}

