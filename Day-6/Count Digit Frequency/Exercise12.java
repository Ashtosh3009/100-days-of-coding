// Exercise12.java
public class Exercise {
    public static int countDigitFrequency(long number, int digit){
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
