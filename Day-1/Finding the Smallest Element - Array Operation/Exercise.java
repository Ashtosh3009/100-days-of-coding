public class Exercise {
    public static int findSmallestElement(int[] arr){
        // initialize smallest with maximum integer value
        int smallest = Integer.MAX_VALUE;

        // loop through each element in the array
        // your code here
        int i;
        for(i = 0 ; i<(arr.length - 1); i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];
            }
        }
        return smallest;

        // return the smallest element found
        // your code here
    }
}
