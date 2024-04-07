// Exercise.java
public class Exercise {
    public static int[] separateEvenOdd(int[] arr){
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            // Move left pointer until an odd number is found
            while (arr[left] % 2 == 0 && left < right)
                left++;
 
            // Move right pointer until an even number is found
            while (arr[right] % 2 == 1 && left < right)
                right--;
 
            if (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
 
        return arr;
    }
}

/*
Solution Explanation:

In this problem, we are given an array, and we are required to separate the even numbers from the odd numbers, with all even numbers appearing before the odd numbers. We can solve this problem using two-pointer technique:
1. We start by initializing two pointers: left and right. left starts at the beginning of the array, and right starts at the end of the array.
2. We then enter a loop that continues until left is less than right. In each iteration of the loop, we move the left pointer to the right until we encounter an odd number and the right pointer to the left until we encounter an even number.
3. If the left pointer is still less than the right pointer, we swap the values at the left and right pointers in the array. We then increment left and decrement right.
4. This process continues until all the even numbers are on the left side of the array and all the odd numbers are on the right side of the array.
5. Finally, we return the manipulated array.
*/
