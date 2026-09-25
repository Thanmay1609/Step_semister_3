public class A3 {
    private final String password;

    A3(String password) {
        this.password = password;
    }

    String getStrength() {
        if (password.length() < 6)
            return "Weak";
        else if (password.length() <= 9)
            return "Medium";
        else
            return "Strong";
    }

    public static void main(String[] args) {
        A3 pc1 = new A3("abcd");
        A3 pc2 = new A3("abcdefgh");
        A3 pc3 = new A3("abcdefghijkl");

        System.out.println(pc1.getStrength());
        System.out.println(pc2.getStrength());
        System.out.println(pc3.getStrength());
    }
}