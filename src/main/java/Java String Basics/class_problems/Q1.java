import java.util.*;

public class Q1 {

    static String playRound(String p, String c) {

        if(p.equals(c))
            return "Draw";

        if(p.equals("Rock") && c.equals("Scissors") ||
           p.equals("Paper") && c.equals("Rock") ||
           p.equals("Scissors") && c.equals("Paper"))
            return "Player Wins";

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String a[] = {"Rock","Paper","Scissors"};

        int w=0,l=0,d=0;

        System.out.println("Round Player Computer Result");

        for(int i=0;i<5;i++) {

            String p = s.next();

            String c = a[(int)(Math.random()*3)];

            String r = playRound(p,c);

            System.out.println((i+1)+" "+p+" "+c+" "+r);

            if(r.equals("Player Wins"))
                w++;
            else if(r.equals("Computer Wins"))
                l++;
            else
                d++;
        }

        System.out.println("Wins: "+w);
        System.out.println("Losses: "+l);
        System.out.println("Draws: "+d);
        System.out.println("Win %: "+(w*100.0/5));
    }
}


