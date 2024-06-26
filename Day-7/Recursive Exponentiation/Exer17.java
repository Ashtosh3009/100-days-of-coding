public class Exercise {
    public static double power(double x, int n){
        if (n == 0)
            return 1;
        else if(n > 0)
            return x * power(x, n - 1);
        else
            return 1 / power(x, -n);
    }
}
/*
Solution Explanation:

The task requires us to implement a function power that calculates x raised to the power n using recursion. We need to take care of three cases here:
1. If n is 0, the result is 1 (this is a universally accepted mathematical convention).
2. If n is greater than 0, we return the multiplication of x with the result of the recursive call power(x, n - 1). This gives us the power of x raised to n.
3. If n is less than 0, we calculate the power for the positive value of n and return the reciprocal of it, because any number x raised to the power of -n is equivalent to 1 / (x^n).
4. The function will be called recursively until n is 0, at which point it will start returning the results back up the call stack, eventually giving us the final result.
  */
