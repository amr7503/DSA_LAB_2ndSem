public class HAQ05_ReverseString_Recursive {
	
	public static String reverse(String s,int n) {
		if(n==0)
			return ""+s.charAt(0);
		
		return s.charAt(n)+reverse(s,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Amaresh Swain";
		System.out.println(reverse(str,str.length()-1));

	}

}
