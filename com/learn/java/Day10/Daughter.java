import java.util.*;
class GrandFather  
{  
	public void show()  
	{  
		System.out.println("I am grandfather.");  
	}  
}  
  
class Father extends GrandFather  
{  
	public void show1()  
	{  
		System.out.println("I am father.");  
	}  
}  

class Son extends Father  
{  
	public void show()  
	{  
		System.out.println("I am son.");  
	}  
}  
 
public class Daughter extends Father  
{  
	public void show()  
	{  
		System.out.println("I am a daughter.");  
	}  

	public static void main(String args[])  
	{  
		Daughter obj = new Daughter();
		Son obj1 = new Son();

		obj1.show();
		obj1.show1();

		obj.show();
		obj.show1();  
	}  
}  