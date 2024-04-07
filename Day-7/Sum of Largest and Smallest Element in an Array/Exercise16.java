public class Exercise {
    public static int sumOfExtremes(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
 
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
 
        return min + max;
    }
}

/*
Solution Explanation:

This exercise is about finding the smallest and largest elements in an array and summing them.
1. We initialize two variables, min and max, to the largest and smallest possible integer values, respectively.
2. We then traverse the array. For each number in the array, we check if it's smaller than min. If it is, we update min. We do a similar check for max.
3. After traversing the array, min and max will hold the smallest and largest elements in the array, respectively. The sum of these two values is then returned.
  */
