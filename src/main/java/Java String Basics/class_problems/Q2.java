import java.util.*;

public class Q2 {

    static boolean isPalindromeIterative(String s) {

        for(int i=0;i<s.length()/2;i++)
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;

        return true;
    }

    static boolean isPalindromeRecursive(String s) {

        if(s.length()<=1)
            return true;

        if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;

        return isPalindromeRecursive(s.substring(1,s.length()-1));
    }

    static boolean isPalindromeArrayReversal(String s) {

        char a[] = s.toCharArray();

        for(int i=0;i<a.length/2;i++) {
            char x=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=x;
        }

        return s.equals(new String(a));
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String x=s.nextLine();

        System.out.println("Iterative: "+
            (isPalindromeIterative(x) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Recursive: "+
            (isPalindromeRecursive(x) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Array Reversal: "+
            (isPalindromeArrayReversal(x) ? "Palindrome" : "Not Palindrome"));
    }
}


