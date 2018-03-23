package my.pattern.singleton;

public class EagerInstantiation {

	public static void main(String[] args) {
		C c=C.getInstance();
		c.display();
	}
}


class C{
	private static C c=new C();
	private C(){};
	
	public static C getInstance(){
		return c;
	}
	
	public void display(){
		System.out.println("Eger initialization...");
	}
}