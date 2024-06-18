public class DAY111_rectanglesInCircle {

    int rectanglesInCircle(int r) {

        double count = 0;

        for (int i = 1; i < 2 * r; i++) {
            double w = Math.sqrt(4 * r * r - i * i);
            count += Math.floor(w);
        }

        return (int) count;
    }
}
