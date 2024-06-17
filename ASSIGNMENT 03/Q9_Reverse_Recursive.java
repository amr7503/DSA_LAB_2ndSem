public class Q9_Reverse_Recursive {
    public static void main(String[] args) {
       int n=34567;
        System.out.println("Reverse of "+n+" is "+reverse(n));
    }
    static int ans=0;
    static int reverse(int x){
       // if(x==0) return ans;// this return statement only closes recursive call
        if(x<10) ans=ans*10+x;

        else{
            int t = x % 10;
            ans=ans*10+t;
            reverse(x / 10) ; 
            // just calling to compute ans .. not storing anywhere
            // ans is class variable outside method
        }
        return ans;
    }
}
