package Lec9;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 24;
		int b = 36;
		int gcd = 1;
		int c = Math.min(a, b);
		
//		for(int i = 1; i <= c; i++)
//		{
//			if(a%i == 0 && b%i == 0)
//			{
//				gcd = i;
//			}
//		}
//		System.out.println(gcd);
		
//		for(int i = c; i >= 1; i--)
//		{
//			if(a%i == 0 && b%i == 0)
//			{
//				gcd = i;
//				break;
//			}
//		}
//		System.out.println(gcd);
		System.out.println(gcd(Math.max(a, b),Math.min(a, b)));

	}
	
	public static int gcd(int a,int b)
	{
		while(a%b != 0)
		{
			int c = a%b;
			
			a = b;
			b = c;
		}
		return b;
	}
	
}
