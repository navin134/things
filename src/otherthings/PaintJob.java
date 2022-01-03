package otherthings;
public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(7.32, 6.45, 2.22, 10));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double wallArea = width * height;
        double calculatedBuckets = (wallArea / areaPerBucket);
        int actualBuckets = (calculatedBuckets % 1 == 0) ? (int) calculatedBuckets : (int) (calculatedBuckets + 1);
        int moreBuckets = (actualBuckets - extraBuckets);

        return moreBuckets;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double wallArea = width * height;
        double calculatedBuckets = (wallArea / areaPerBucket);
        int actualBuckets = (calculatedBuckets % 1 == 0) ? (int) calculatedBuckets : (int) (calculatedBuckets + 1);

        return actualBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double calculatedBuckets = (area / areaPerBucket);
        int actualBuckets = (calculatedBuckets % 1 == 0) ? (int) calculatedBuckets : (int) (calculatedBuckets + 1);

        return actualBuckets;
    }
}
