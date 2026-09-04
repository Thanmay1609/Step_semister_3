import java.util.*;

public class Q5 {

    static String reverseCustomerName(String s) {

        char a[]=s.toCharArray();
        String x="";

        for(int i=a.length-1;i>=0;i--)
            x=x+a[i];

        return x;
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        String name=s.nextLine();

        System.out.println("Original Name: "+name);
        System.out.println("Reversed Name: "+reverseCustomerName(name));
    }
}


