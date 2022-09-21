class GroceryStoreRunner{
	public static void main(String[] shop)
	{
	
	GroceryStore.setStoreName("Kirani angadi");
	GroceryStore.setLocation("majestic");
	GroceryStore.setWorkers(5);
	GroceryStore.setMaleWorkers(5);
	GroceryStore.setStock(true);
	GroceryStore.setHomeDelivery(false);
	GroceryStore.setReviews("good quality");
	GroceryStore.setRating(4);
	GroceryStore.setOnlineOrder(false);
	GroceryStore.setDiscount(19);
	GroceryStore.setGstavailable(true);
	GroceryStore.setGstNo("GSTNUMBER123456789");
	GroceryStore.setParkingAvailable(false);
	
	String ref1=GroceryStore.getStoreName();
	System.out.println("StoreName: "+ref1);
	
	String ref2=GroceryStore.getLocation();
	System.out.println("Location: "+ref2);
	
	int ref3=GroceryStore.getWorkers();
	System.out.println("Workers: "+ref3);
	
	int ref4=GroceryStore.getMaleWorkers();
	System.out.println("MaleWorkers: "+ref4);
	
	
	boolean ref6=GroceryStore.isStock();
	System.out.println("Stock: "+ref6);
	
	boolean ref7=GroceryStore.isHomeDelivery();
	System.out.println("HomeDelivery: "+ref7);
	
	String ref8=GroceryStore.getReviews();
	System.out.println("Reviews: "+ref8);
	
	int ref9=GroceryStore.getRating();
	System.out.println("Rating: "+ref9);
	
	boolean ref10=GroceryStore.isOnlineOrder();
	System.out.println("OnlineOrder: "+ref10);
	
	double ref11=GroceryStore.getDiscount();
	System.out.println("Discount: "+ref11);
	
	boolean ref12=GroceryStore.isGstavailable();
	System.out.println("Gstavailable: "+ref12);
	
	String ref13=GroceryStore.getGstNo();
	System.out.println("GstNo: "+ref13);
	
	boolean ref14=GroceryStore.isParkingAvailable();
	System.out.println("ParkingAvailable: "+ref14);
	
	}


}