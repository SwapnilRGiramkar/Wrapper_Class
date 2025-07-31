//This program gives fully Object Oriented programming Like Python Using wrapper classes 
package wrapper;
public class AutoBox2
{
	public static void main(String[]args)
	{
		Object a=10;//Upcasting to Object class Integer
		Object b=34.23;//Upcasting to Object class Double
		Object c=(Integer)a+(Double)b;//Downcast to respective class 
		System.out.println(c);//Upcasting to object class DOuble
	}
}
