public class Exercise {
    public static void separateZeroAndOne(int[] arr){
        int counter = 0;  // counter for 0's
 
        // Traverse the array and count the number of 0's
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                counter++;
            }
        }
 
        // Fill the first 'n' indices of the array with 0's
        for(int i = 0; i < counter; i++){
            arr[i] = 0;
        }
 
        // Fill the rest of the array with 1's
        for(int i = counter; i < arr.length; i++){
            arr[i] = 1;
        }
    }
}
