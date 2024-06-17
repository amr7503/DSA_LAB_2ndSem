
public class HAQ01_GCD_Recursion {
    public static int gcd(int m,int n)
    {
        if(m%n==0) return n;
        else
        return gcd(n,m%n);
    }

    public static void main(String[] args) {
        System.out.println("GCD = "+gcd(9,6));
    }
}

/* Iterative gcd::::

   while(a%b!=0)
		{
			int t = a%b;
			a=b;
			b=t;

		}
		System.out.println("GCD = "+b);
 */
