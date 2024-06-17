import java.util.Scanner;

public class HAQ06_Palindrome_Recursion {

    public static boolean isPalin(String str,int left,int right){
        if(left>=right)
            return true;
        if(str.charAt(left) != str.charAt(right))
            return false;

        return isPalin(str,left+1,right-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.next();
        if(isPalin(str,0,str.length()-1))
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+" is not palindrome");
    }
}
