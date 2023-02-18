package object;

public class UseMarker {
	public static void main (String [] args) {
		Marker marker1 = new Marker () ;
		marker1.brand = "Reynolds" ;
		marker1.price = 50 ;
		marker1.colour = "Black" ;
		marker1.size = 5 ;
		marker1.isPermanent = false ;
		System.out.println ("Brand= "+marker1.brand+" Price= "+marker1.price+ " Colour= "+marker1.colour+ " Size= "+marker1.size+ " IsPermanent= "+marker1.isPermanent);
	}

}
