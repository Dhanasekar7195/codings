package object;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		laptop1.manufacturer = "Dell";
		laptop1.isIntel = true;
		laptop1.colour = "Black";
		laptop1.price = 50000;
		laptop1.discount = 10000;
		laptop1.netprice = laptop1.price - laptop1.discount;
		System.out.println("Manufacturer= " + laptop1.manufacturer + "IsIntel= " + laptop1.isIntel + "Colour= "
				+ laptop1.colour + "Price= " + laptop1.price + "Discount= " + laptop1.discount + "Netprice= "
				+ laptop1.netprice);

		Laptop laptop2 = new Laptop();
		laptop2.manufacturer = "Hp";
		laptop2.isIntel = false;
		laptop2.colour = "Grey";
		laptop2.price = 60000;
		laptop2.discount = 13000;
		laptop2.netprice = laptop2.price - laptop2.discount;
		System.out.println("Manufacturer= " + laptop2.manufacturer + "IsIntel= " + laptop2.isIntel + "Colour= "
				+ laptop2.colour + "Price= " + laptop2.price + "Discount= " + laptop2.discount + "Netprice= "
				+ laptop2.netprice);
		int netpricetotal = laptop1.netprice+laptop2.netprice ;
		System.out.println ("Netpricetotal= "+netpricetotal) ;
	}

}
