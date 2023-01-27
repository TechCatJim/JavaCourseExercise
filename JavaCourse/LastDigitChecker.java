public class LastDigitChecker {
    // write your code here
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!(isValid(num1)) || !(isValid(num2)) || !(isValid(num3))) {
            return false;
        }
        int num1rm = num1 % 10;
        int num2rm = num2 % 10;
        int num3rm = num3 % 10;

        if (num1rm == num2rm || num2rm == num3rm || num1rm == num3rm) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) {
            return true;
        }
        return false;
    }
}