public class L4 {

    public static void main(String[] args) {
        Course c1 = new Course("21CSC201J", "Data Structures");

        System.out.println(c1.code + " - " + c1.title);
    }
}

class Course {
    String code;
    String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }
}

