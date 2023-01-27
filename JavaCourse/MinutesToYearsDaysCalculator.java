public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else if (minutes > 1440) {
            long years = minutes / 525600;
            long days = minutes / 1440 - (years * 365);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            long days = minutes / 1440;
            System.out.println(minutes + " min = " + "0" + " y and " + days + " d");
        }

    }
}