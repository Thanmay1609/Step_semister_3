import java.util.Arrays;

public class Assign5 {

    static class Player implements Comparable<Player> {
        final String name;
        int matchesPlayed;
        double battingAverage;
        boolean injured;
        static int totalPlayers = 0;

        public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
            totalPlayers++;
        }

        public Player(String name, int matchesPlayed) {
            this(name, matchesPlayed, 0.0, false);
        }

        public Player() {
            this("Unknown", 0);
        }

        public int compareTo(Player other) {
            if (this.battingAverage > other.battingAverage) {
                return -1;
            } else if (this.battingAverage < other.battingAverage) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    static boolean isDraftable(int matchesPlayed) {
        if (matchesPlayed >= 10) {
            return true;
        }
        return false;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        if (matchesPlayed >= 5 && injured == false) {
            return true;
        }
        return false;
    }

    static String draftAndRank(Player[] players) {
        int count = 0;
        for (Player p : players) {
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                count = count + 1;
            }
        }

        Player[] draftable = new Player[count];
        int index = 0;
        for (Player p : players) {
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                draftable[index] = p;
                index = index + 1;
            }
        }

        Arrays.sort(draftable);

        String result = "";
        int rank = 1;
        for (Player p : draftable) {
            result = result + rank + ". " + p.name;

            if (rank != draftable.length) {
                result = result + " | ";
            }
            rank = rank + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Player[] players = new Player[4];
        players[0] = new Player("Virat", 15, 48.0, false);
        players[1] = new Player("Rahul", 7, 55.0, false);
        players[2] = new Player("Sameer", 3, 60.0, false);
        players[3] = new Player("Dev", 12, 20.0, true);

        System.out.println(draftAndRank(players));

        System.out.println("Total players created: " + Player.totalPlayers);

        Object obj = players[0];
        if (obj instanceof Player) {
            System.out.println(obj + " check passed: this is a Player object");
        }
    }
}