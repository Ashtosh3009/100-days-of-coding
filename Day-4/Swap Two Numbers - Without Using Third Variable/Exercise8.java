// Exercise.java
public class Exercise {
    public static int[] swapNumbers(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        
        return new int[]{a, b};
    }
}
