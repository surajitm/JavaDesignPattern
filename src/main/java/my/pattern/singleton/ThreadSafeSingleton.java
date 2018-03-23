package my.pattern.singleton;

public class ThreadSafeSingleton {

	
	public static void main(String[] args) {
		B b=B.getInstance();
		
	}
}

//Now thread safe 
//Best practice told do not use to much synchronized untill it is really needed.
class B{
	private static B obj;
	private B(){}
	
	public synchronized static B getInstance(){
		if(obj==null){
			obj=new B();
		}
		return obj;
	}
	
	public void print(){
		System.out.println("I am a thread safe singleton object");
	}
	
}