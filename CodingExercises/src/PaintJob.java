public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));
    }


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {

            double wallArea = width * height;
            double bucketsNeeded = wallArea / areaPerBucket;
            int numberOfBuckets = (int) (Math.ceil(bucketsNeeded) - extraBuckets);

            return numberOfBuckets;

        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {

            double wallArea = width * height;
            int bucketsNeeded = (int) (Math.ceil(wallArea / areaPerBucket));

            return bucketsNeeded;

        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            int bucketsNeeded = (int) (Math.ceil(area/ areaPerBucket));
            return bucketsNeeded;
        }
    }
}
