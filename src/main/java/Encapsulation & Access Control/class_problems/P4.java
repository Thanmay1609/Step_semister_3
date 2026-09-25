public class P4 {
    private final int lockerNumber;
    private String code;

    P4(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    boolean changeCode(String oldCode, String newCode) {
        if (code.equals(oldCode)) {
            code = newCode;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        P4 l = new P4(101, "1234");

        System.out.println(l.changeCode("1234", "5678"));
        System.out.println(l.changeCode("0000", "9999"));
    }
}