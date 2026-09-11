import java.util.Arrays;

public class P5 {

    static class Candidate implements Comparable<Candidate> {
        String name;
        double cgpa;
        int codingScore;
        double compositeScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
            this.compositeScore = (cgpa * 10) + (codingScore * 0.5);
        }

        public int compareTo(Candidate other) {
            if (this.compositeScore > other.compositeScore) {
                return -1;
            } else if (this.compositeScore < other.compositeScore) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    static boolean isEligible(double cgpa) {
        if (cgpa >= 7.5) {
            return true;
        }
        return false;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        if (cgpa >= 6.5 && codingScore >= 50) {
            return true;
        }
        return false;
    }

    static String shortlistAndRank(Candidate[] candidates) {
        int count = 0;
        for (Candidate c : candidates) {
            if (isEligible(c.cgpa) || isEligible(c.cgpa, c.codingScore)) {
                count = count + 1;
            }
        }

        Candidate[] shortlisted = new Candidate[count];
        int index = 0;
        for (Candidate c : candidates) {
            if (isEligible(c.cgpa) || isEligible(c.cgpa, c.codingScore)) {
                shortlisted[index] = c;
                index = index + 1;
            }
        }

        Arrays.sort(shortlisted);

        String result = "";
        int rank = 1;
        for (Candidate c : shortlisted) {
            result = result + rank + ". " + c.name;
            result = result + " (" + String.format("%.1f", c.compositeScore) + ")";

            if (rank != shortlisted.length) {
                result = result + " | ";
            }
            rank = rank + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[4];
        candidates[0] = new Candidate("Aisha", 8.2, 40);
        candidates[1] = new Candidate("Rohit", 6.8, 65);
        candidates[2] = new Candidate("Meena", 6.0, 90);
        candidates[3] = new Candidate("Karan", 7.5, 20);

        System.out.println(shortlistAndRank(candidates));
    }
}