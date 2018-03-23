package my.pattern.Factory;



/*
 * Factory method pattern-
 * 
 */



public class IcecreamFactoryPattern {

	public static void main(String[] args) {
		
		IceCream ice=IcecreamFactory.getIcecream("CHOCOLATE");
		ice.getIcecream();
		
		IceCream ice1=IcecreamFactory.getIcecream("VANILA");
		ice1.getIcecream();

		
	}
}


interface IceCream{
	public void getIcecream();
}

class IcecreamFactory {
	public static IceCream getIcecream(String ice){
		if(ice==null){
			return null;
		}else if(ice.equalsIgnoreCase("CHOCOLATE")){
			return new ChocolateIcecream();
		}else if(ice.equalsIgnoreCase("VANILA")){
			return new VanilaIcecream();
		}
		return null;
	}
}



class ChocolateIcecream implements IceCream{

	@Override
	public void getIcecream() {
		System.out.println(" You got Chocolate icecream..");
	}
	
}

class VanilaIcecream implements IceCream{

	@Override
	public void getIcecream() {
		System.out.println("You got Vanilla icecream");
	}
	
}