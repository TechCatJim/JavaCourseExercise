public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
            return false;
        }
        int num1Ld = num1 % 10;
        int num2Ld = num2 % 10;
        int num1Fd = num1 / 10;
        int num2Fd = num2 / 10;

        return ((num1Fd == num2Fd) || (num1Fd == num2Ld) || (num1Ld == num2Fd) || (num1Ld == num2Ld)) ? true : false;
    }
}