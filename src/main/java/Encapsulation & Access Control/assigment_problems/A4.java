public class A4 {
    private final String id;
    private String color;

    A4(String id) {
        this.id = id;
        color = "RED";
    }

    void next() {
        if (color.equals("RED"))
            color = "GREEN";
        else if (color.equals("GREEN"))
            color = "YELLOW";
        else
            color = "RED";
    }

    String getColor() {
        return color;
    }

    public static void main(String[] args) {
        A4 t = new A4("TL-9");

        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());

        t.next();
        System.out.println(t.getColor());
    }
}