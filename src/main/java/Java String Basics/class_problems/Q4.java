import java.util.*;

public class Q4 {

    static char findFirstNonRepeatingChar(String s) {

        for(int i=0;i<s.length();i++) {

            int c=0;

            for(int j=0;j<s.length();j++) {

                if(s.charAt(i)==s.charAt(j))
                    c++;
            }

            if(c==1)
                return s.charAt(i);
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        String x=s.nextLine();

        char a=findFirstNonRepeatingChar(x);

        if(a=='\0')
            System.out.println("No Non-Repeating Character Found");
        else
            System.out.println("First Non-Repeating Character: '"+a+"'");
    }
}


