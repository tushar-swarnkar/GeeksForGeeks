public class DAY110_lineIntersection {
    String doIntersect(int p1[], int q1[], int p2[], int q2[]) {
        if ((q1[0] - p1[0] == 0 && q2[0] - p2[0] == 0) || (q1[1] - p1[1] == 0 && q2[1] - p2[1] == 0)) {
            return "false";
        }

        double X = 0;
        double Y = 0;
        boolean isEnter = true;
        boolean isEnter2 = true;

        double x1 = (double) p1[0];
        double y1 = (double) p1[1];

        double x2 = (double) q1[0];
        double y2 = (double) q1[1];

        double x11 = (double) p2[0];
        double y11 = (double) p2[1];

        double x22 = (double) q2[0];
        double y22 = (double) q2[1];

        if (q1[0] - p1[0] == 0) {
            X = p1[0];
            isEnter = false;
        } else if (q2[0] - p2[0] == 0) {
            X = p2[0];
            isEnter = false;
        }

        if (q1[1] - p1[1] == 0) {
            Y = p1[1];
            isEnter2 = false;
        } else if (q2[1] - p2[1] == 0) {
            Y = p2[1];
            isEnter2 = false;
        }

        if (isEnter) {
            X = (y11 - y1 + x1 * (y2 - y1) / (x2 - x1) - x11 * (y22 - y11) / (x22 - x11))
                    / ((y2 - y1) / (x2 - x1) - (y22 - y11) / (x22 - x11));
        }
        if (isEnter2) {
            Y = (x11 - x1 + y1 * (x2 - x1) / (y2 - y1) - y11 * (x22 - x11) / (y22 - y11))
                    / ((x2 - x1) / (y2 - y1) - (x22 - x11) / (y22 - y11));
        }

        if (((x1 <= X && X <= x2) || (x1 >= X && X >= x2)) && ((x11 <= X && X <= x22) || (x11 >= X && X >= x22))
                && ((y1 <= Y && Y <= y2) || (y1 >= Y && Y >= y2))
                && ((y11 <= Y && Y <= y22) || (y11 >= Y && Y >= y22))) {
            return "true";
        }

        return "false";
    }
}
