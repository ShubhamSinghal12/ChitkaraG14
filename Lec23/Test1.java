package Lec23;

public interface Test1 {
	
	void hello1();
	default void hd()
	{
		System.out.println("In Test Default");
//		hp();
	}
	

}
