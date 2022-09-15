import java.util.*;
class Wishes  
{  
	void message()  
	{  
		System.out.println("Best of Luck!!");  
	}  
}

class Birthday  
{  
	void message1()  
	{  
		System.out.println("Happy Birthday!!");  
	}  
}

public class Demo extends Wishes,Birthday    
{  
	public static void main(String args[])  
	{    
		Demo obj=new Demo();    
		obj.message1();  
		obj.message();   
	}    
}    