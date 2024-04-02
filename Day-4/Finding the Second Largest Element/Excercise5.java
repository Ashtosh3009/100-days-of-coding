public class Exercise {
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Input array should have at least two elements");
        }
 
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
 
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num < firstLargest && num > secondLargest) {
                secondLargest = num;
            }
        }
 
        return secondLargest;
    }
}
