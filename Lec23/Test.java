package Lec23;

public interface Test extends Test1,Test2{
	
	static final int m = 100;
	public abstract void hello();
	
	default void hd()
	{
		System.out.println("In Test Default");
		hp();
	}
	
	static void hs()
	{
		System.out.println("In Test Static");
	}
	private void hp()
	{
		System.out.println("In Test Private");
	}

}
