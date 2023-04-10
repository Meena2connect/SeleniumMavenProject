package day10;

public class Program04 extends Program03{
	Program04()
	{
		super.a=200;
		super.b=500;
	}	
	
	public static void main(String[] args) {
		
		Program04 x= (Program04) new Program03();
		System.out.println(x.a+x.b);

	}

}
