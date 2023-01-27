public class SumOddRange {
    public static boolean isOdd(int nr) {
        if (nr > 0) {
            if (nr % 2 != 0) {
                return true;
            }
        }
        ;
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end >= start) && (start > 0) && (end > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
                ;
            }
            ;
            return sum;
        }
        ;
        return -1;
    }
}