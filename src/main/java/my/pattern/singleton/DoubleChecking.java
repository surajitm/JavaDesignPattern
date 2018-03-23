package my.pattern.singleton;

/*
 * in synchronized way once the object is created ,synchronization is not useful;
 * In this way we are using synchronization only object creation time.
 */

public class DoubleChecking {

}

class D{
	private static D d;
	private D(){};
	
	public static D getInstance(){
		if(d==null){
		synchronized(D.class){
			if(d==null){
				d=new D();
			}
		}
		}
		return d;
	}
	
	
}