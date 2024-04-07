public class Exercise {
    public static int countCapitalLetters(String str){
        int count = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
 
        return count;
    }
}
/*
Solution Explanation:

The solution for this problem involves string traversal and character manipulation. Here's how it works:
1. A counter count is initialized to keep track of the number of capital letters in the string.
2. Using a for loop, each character in the string is inspected. For each character, we use the Character.isUpperCase() method from Java's Character class to check if it is an uppercase letter. If it is, we increment our counter.
3. After the loop finishes (we've inspected all characters in the string), we return the counter which now represents the count of uppercase letters in the string.
*/
