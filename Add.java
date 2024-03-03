class sum
{
	void Adder(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition of two number:"+c); 
	}
	void Adder(int a,int b,int c)
	{
		int d;
		d=a+b+c;
		System.out.println("Addition of three numbers:"+d);	
	}
}
class boss
{
	public static void main(String args[])
	{
		sum obj1=new sum();
		obj1.Add(10,35);
		obj1.Add(21,33,55);
	}
}




