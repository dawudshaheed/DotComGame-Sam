package com.appinc.ecommerce;
public class GiftShop2 {
	public static void main (String [] arguments) {
			Storefront2 store = new Storefront2 ();
			store.addItem("CO1", "MUG", "9.99", "150", "FALSE");
			store.addItem("CO2", "LG MUG", "12.99", "82", "TRUE");
			store.addItem("CO3", "MOUSEPAD", "10.49", "800", "FALSE");
			store.addItem("DO1", "T SHIRT", "16.99", "90", "TRUE");
			store.sort();
			
			for (int i = 0; i < store.getSize(); i++) {
				Item2 show = (Item2)store.getItem(i);
				System.out.println("\nItem ID: " + show.getId() + "\nName: " + show.getName() + "\nPrice: $" + show.getRetail() + "\nPrice: $" + show.getPrice() + "\nQuantity: " + show.getQuantity() + "\n"+ show.getDiscount());
			}		

	}

}
