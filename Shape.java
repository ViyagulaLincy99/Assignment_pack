//write a program to check how many object are created
public class Shape {
	static int count;
static
{
	count=0;
}
Shape()
{
	count++;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s1=new Shape();
Shape s2=new Shape();
Shape s3=new Shape();
System.out.println(count);

	}

}
