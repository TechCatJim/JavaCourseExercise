public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        double totalArea = width * height;
        double quantityToBuy = totalArea / areaPerBucket - extraBuckets;
        return (int) Math.ceil(quantityToBuy);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double totalArea = width * height;
        double quantityToBuy = totalArea / areaPerBucket;
        return (int) Math.ceil(quantityToBuy);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        double quantityToBuy = area / areaPerBucket;
        return (int) Math.ceil(quantityToBuy);
    }
}