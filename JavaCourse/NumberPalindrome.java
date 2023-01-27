public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = 0;
        int remainder;

        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
        }
        ;

        if (originalNum == reverseNum) {
            return true;
        }
        return false;

    }
}