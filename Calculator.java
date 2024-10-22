public class Calculator
{
public int add(int a,int b)
{
int c=a+b;
return c;
}
public int square(int x)
{
int z=x*x;
}
public void main (String args[])
{
Calculator cal = new Calculator();
System.out.println("the sum"+cal.add(2,3));
System.out.println("squ"+cal.square(4));
}
}
