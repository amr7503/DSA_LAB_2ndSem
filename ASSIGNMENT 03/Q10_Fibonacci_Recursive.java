
class Q10_Fibonacci_Recursive {
   public static int fib(int n){
       if(n==1 || n==2 ) return 1;
       else return fib(n-1)+fib(n-2);
   }
    public static void main(String[] args) {
        System.out.println("First 10 fibonacci sequence is ");
        for (int i = 1; i <= 10; i++)
            System.out.print(fib(i)+" ");
    }
}

/* ::::: OUTPUT :::::

First 10 fibonacci sequence is
1 1 2 3 5 8 13 21 34 55

 */
