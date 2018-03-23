package my.pattern.singleton;

/*
 * Responsibility is to provide only one instance per class and provide global access to that object.
 *  What are the two forms of singleton pattern?
 *  1)Early initialization: Create instance at load time.
 *  2)Lazy initialization: Create instance when requires.
 *  
 *  Usase:
 *  1)Multi threaded programming.
 *  2)Database application.
 *  3)Logging,caching,thread pools.
 *  Benifit:
 *  1)Saves memory - Because one object is created per class.
 *  2)Only single instance is used again and again.
 *  
 */

public class SimpleSingletonDemo {
	
public static void main(String[] args) {
	A a=A.getInstance();
	a.doSomething();
}	
}

//classic implementation -
//Classic implementation not thread safe--
class A{
	private static A obj; 
	private A(){
	}
	
	public static A getInstance(){
		if(obj==null){
			obj=new A();
		}
		return obj;
	}
	
	public void doSomething(){
		System.out.println("Doing something..");
	}
	
}