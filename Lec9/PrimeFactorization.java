package Lec9;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 24;
//		for(int i = 2; i <= n; i++)
//		{
//			while(n%i == 0)
//			{
//				System.out.print(i+" ");
//				n /= i;
//			}
//		}
//		int i = 2;
//		while(n>1)
//		{
//			while(n%i == 0)
//			{
//				System.out.print(i+" ");
//				n /= i;
//			}
//			i += 1;
//		}
		
		int i = 2;
		while(n>1)
		{
			if(n%i == 0)
			{
				n /= i;
				if(n!=1)
				System.out.print(i+"*");
				else
				{
					System.out.print(i);
				}
			}
			else {
					i += 1;
			}
		}
	}

}
