import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double champion_result = 0;
        String champion_word = "";
        int count = 1;
        while (!StdIn.isEmpty()) {
            count++;
            String current_word = StdIn.readString();
            int i;
            double val = 1 / count;
            double current_result = StdRandom.bernoulli(( double));

            if (current_result > champion_result) {
                champion_result = current_result;
                champion_word = current_word;
            }
        }

        StdOut.println(champion_word);
    }
}
