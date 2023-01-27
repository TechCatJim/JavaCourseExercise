public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int A = (int) (a * 1000);
        int B = (int) (b * 1000);
        return A == B;
    }

}