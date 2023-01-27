public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        } else {
            double milesperhour = kilometersPerHour / 1.609;
            return Math.round(milesperhour);
        }
    }
    
    public static void printConversion (double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milesperhour = kilometersPerHour / 1.609;
            long ans = Math.round(milesperhour);
            System.out.println(kilometersPerHour + " km/h = " + ans + " mi/h");
            }
    }
}