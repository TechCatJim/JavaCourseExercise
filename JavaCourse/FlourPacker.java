public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int total = bigCount * 5 + smallCount * 1;
        int diff = total - goal;
        boolean enoughFlour = (total >= goal);
        while (diff >= 5) {
            diff = diff - 5;
        }
        if (enoughFlour && (diff <= smallCount)) {
            return true;
        }
        return false;
    }
}