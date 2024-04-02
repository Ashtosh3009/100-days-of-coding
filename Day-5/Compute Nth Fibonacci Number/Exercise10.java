public class Exercise {
    public static long nthFibonacci(int n){
        long[] memo = new long[n+1];
        return fibonacci(n, memo);
    }
 
    private static long fibonacci(int n, long[] memo){
        if(n <= 1){
            return n;
        }
        if(memo[n] == 0){
            memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        }
        return memo[n];
    }
}
