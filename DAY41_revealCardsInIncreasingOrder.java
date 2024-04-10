import java.util.Arrays;

public class DAY41_revealCardsInIncreasingOrder {

    // LEETCODE: 950

    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};

        System.out.println(Arrays.toString (deckRevealedIncreasing(deck)));
    }
    static int[] deckRevealedIncreasing(int[] deck) {
        if (deck.length == 1) {
            return deck;
        }

        Arrays.sort (deck);

        int[] res = new int [deck.length];
        int k = 1;
        int c = 0;
        res[0] = deck[0];

        while (k < deck.length) {
            for (int i = 1; i < deck.length; i++) {
                if (res[i] == 0) {
                    c++;
                    if (c == 2) {
                        res[i] = deck[k++];
                        c = 0;
                    }
                }
            }
        }

        return res;
    }
}
