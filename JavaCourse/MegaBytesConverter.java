public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int ZZ = kiloBytes % 1024;
            int YY = Math.round(kiloBytes / 1024);
            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");
        }
    }
}