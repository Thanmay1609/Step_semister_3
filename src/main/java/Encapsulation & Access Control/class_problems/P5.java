public class P5 {
    private final String[] names;
    private int count;

    P5(int size) {
        names = new String[size];
        count = 0;
    }

    void markPresent(String name) {
        if (isPresent(name))
            return;

        if (count < names.length) {
            names[count] = name;
            count++;
        }
    }

    int getPresentCount() {
        return count;
    }

    boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        P5 sheet = new P5(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println(sheet.getPresentCount());
        System.out.println(sheet.isPresent("Ben"));
        System.out.println(sheet.isPresent("Chen"));
    }
}