package object;

public class UseMobile {
	public static void main (String [] args) {
		Mobile mobile1 = new Mobile () ;
		mobile1.brand = "Redmi" ;
		mobile1.model = "Notepro" ;
		mobile1.price = 12000 ;
		mobile1.storage = "64Gb" ;
		mobile1.isAndroid = true ;
		System.out.println ("Brand= "+mobile1.brand+"Model= "+mobile1.model+"Price= "+mobile1.price+"Storage= "+mobile1.storage+"IsAndroid= "+mobile1.isAndroid);
		
		Mobile mobile2 = new Mobile () ;
		mobile2.brand = "Redmi" ;
		mobile2.model = "Notepro" ;
		mobile2.price = 12000 ;
		mobile2.storage = "64Gb" ;
		mobile2.isAndroid = true ;
		System.out.println ("Brand= "+mobile2.brand+"Model= "+mobile2.model+"Price= "+mobile2.price+"Storage= "+mobile2.storage+"IsAndroid= "+mobile2.isAndroid);
	
		Mobile mobile3 = new Mobile () ;
		mobile3.brand = "Realme" ;
		mobile3.model = "Notepro" ;
		mobile3.price = 18500 ;
		mobile3.storage = "128Gb" ;
		mobile3.isAndroid = true ;
		System.out.println ("Brand= "+mobile3.brand+"Model= "+mobile3.model+"Price= "+mobile3.price+"Storage= "+mobile3.storage+"IsAndroid = "+mobile3.isAndroid) ;
		int total = mobile1.price+mobile2.price+mobile3.price ;
		System.out.println ("Total= "+total) ;
				
	}

}
