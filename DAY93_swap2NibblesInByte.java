public class DAY93_swap2NibblesInByte {
    public static void main(String[] args) {

    }

    static int swapNibbles(int n) {
        String binaryString = Integer.toBinaryString(n);
        while (binaryString.length() < 8) {
            binaryString = "0" + binaryString;
        }
        int mid = (binaryString.length() / 2);

        String string = binaryString.substring(mid) + binaryString.substring(0, mid);

        return Integer.parseInt(string, 2);
    }
}
