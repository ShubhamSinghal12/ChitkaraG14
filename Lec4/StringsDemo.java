package Lec4;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Hello";
		String st1 = "Hello";
		String st2 = new String("Hello");
//		System.out.println(st2);
//		System.out.println(st.length());
//		System.out.println(st.charAt(1));
//		System.out.println(st.substring(1));
//		System.out.println(st.indexOf("lll"));
//		System.out.println(st.lastIndexOf("ll"));
//		System.out.println(st.startsWith("Hel"));
//		System.out.println(st.endsWith("lll"));
//		System.out.println(st.contains("ell"));
		
//		System.out.println(st==st2);
//		System.out.println(st.equals(st2));
		
//		String s = st + 123.456;
//		System.out.println(2+3+" "+4+5);
		
//		st = st+"123";
//		System.out.println(st);
//		System.out.println(st1);
//		SS(st1);
//		System.out.println(isPalindrome("nitinn"));
//		allPSS("nitinn");
		AxisOrbit("nitinn");
	}
	
	public static void SS(String s)
	{
		for(int i = 0; i <s.length();i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				System.out.println(s.substring(i,j+1));
			}
		}
	}
	public static void allPSS(String s)
	{
		int count = 0;
		for(int i = 0; i <s.length();i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				String st = s.substring(i,j+1);
				if(isPalindrome(st))
				{
					System.out.println(st);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static boolean isPalindrome(String s)
	{
		int si = 0;
		int ei = s.length()-1;
		while(si < ei)
		{
			if(s.charAt(si) != s.charAt(ei))
			{
				return false;
			}
			si ++;
			ei --;
		}
		return true;
	}
	
	public static void AxisOrbit(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			count++;
			int si = i-1;
			int ei = i+1;
			while(si >= 0 && ei < s.length() && s.charAt(si) == s.charAt(ei))
			{
				count++;
				si--;
				ei++;
			}
		}
		for(int i = 0; i < s.length()-1; i++)
		{
			int si = i;
			int ei = i+1;
			while(si >= 0 && ei < s.length() && s.charAt(si) == s.charAt(ei))
			{
				count++;
				si--;
				ei++;
			}
		}
		System.out.println(count);
	}
}
