public class P3 {
    private final String firstName;
    private final char lastInitial;

    P3(String fullName) {
        String[] parts = fullName.split(" ");

        firstName = parts[0];
        lastInitial = parts[1].charAt(0);
    }

    String getNickname() {
        return firstName + " " + lastInitial + ".";
    }

    public static void main(String[] args) {
        P3 tag = new P3("Maria Gomez");

        System.out.println(tag.getNickname());
    }
}