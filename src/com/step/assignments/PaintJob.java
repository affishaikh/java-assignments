package com.step.assignments;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(6, 6, 6, 0));
        System.out.println(getBucketCount(7.18,  6.6, 4.5, 1));
        System.out.println(getBucketCount(3.4,  2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4,  2.1, 1.5));
        System.out.println(getBucketCount(-3.4,  2.1, 1.5));
    }

    private static boolean isInvalid(double width, double height, double areaPerBucket, int extraBuckets) {
        return (width < 1 || height < 1 || areaPerBucket < 1 || extraBuckets < 0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (isInvalid(width, height, areaPerBucket, extraBuckets)) {
            return -1;
        }

        double totalArea = width * height;
        double requiredBuckets = totalArea / areaPerBucket;
        return (int) (Math.round(requiredBuckets) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (isInvalid(width, height, areaPerBucket)) {
            return -1;
        }

        double totalArea = width * height;
        double requiredBuckets = totalArea / areaPerBucket;
        return (int) Math.round(requiredBuckets);
    }

    private static boolean isInvalid(double width, double height, double areaPerBucket) {
        return (width < 1 || height < 1 || areaPerBucket < 1);
    }
}
