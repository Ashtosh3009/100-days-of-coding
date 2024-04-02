// Exercise.java
public class Exercise {
    public static int countDigits(int number){
        if (number < 0) {
            number = number * -1;
        }
        if (number == 0) {
            return 1;
        }
        return (int)Math.floor(Math.log10(number) + 1);
    }
}
