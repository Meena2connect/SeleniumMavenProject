package day10;

public class Program03 {
	
	int a=1;
	int b=2;
	
	public Program03()
	{
		System.out.println("Program4 is Started");
	}
	
	private Program03(int a, int b)
	{
		this.a=a;
		this.b=b;
	}

	public static void main(String[] args) {
		
		Program03 pro1 = new Program03();
		System.out.println(pro1.a+pro1.b);
		
		Program03 pro2 = new Program03(20,30);
		System.out.println(pro2.a+pro2.b);

	}

}