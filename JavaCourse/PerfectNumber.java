public class PerfectNumber {
    // write your code here
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;

        for (int i = 1; i < number; i++) {
            sum += (number % i == 0) ? i : 0;
        }
        return number == sum;
    }
}