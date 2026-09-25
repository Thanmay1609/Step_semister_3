public class P2 {
    private final boolean[] answers;
    private int count;

    P2(int questions) {
        answers = new boolean[questions];
        count = 0;
    }

    void recordAnswer(boolean correct) {
        if (count < answers.length) {
            answers[count] = correct;
            count++;
        }
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < count; i++) {
            if (answers[i])
                score++;
        }

        return score;
    }

    public static void main(String[] args) {
        P2 sc = new P2(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println(sc.getScore());
    }
}