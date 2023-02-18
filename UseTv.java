package object;

public class UseTv {
	public static void main (String [] args) {
		Tv tv1 = new Tv () ;
		tv1.brand = "Sony";
		tv1.price = 40000;
		tv1.taxpercent = 5;
		tv1.discountpercent = 10;
		tv1.taxamount = tv1.price * tv1.taxpercent/100;
		tv1.discountamount = tv1.price * tv1.discountpercent/100;
		tv1.netprice = tv1.price - tv1.discountamount + tv1.taxamount;
		System.out.println ("Netprice= "+tv1.netprice);
	}

}
