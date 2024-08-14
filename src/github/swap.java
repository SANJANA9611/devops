package github;

import org.testng.annotations.Test;

public class swap {
	@Test
	public void swap1()
	{
		int a=10;
		int b=20;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
	}

}
