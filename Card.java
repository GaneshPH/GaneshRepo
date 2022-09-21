<<<<<<< HEAD
class Card{
	static String type;
	static String height;
	static int width;
	static double price;
	static String[] color;
	
	
	static void displayDetails(){
		
	System.out.println(type);
	System.out.println(height);
	System.out.println(width);
	System.out.println(price);
	if(color!=null){
		for(int position=0;position<color.length;position++)
			{
			String ref=color[position];
			System.out.println(ref+" "+position);
			}
	}
	else{
	System.out.println("Array is null");
	}
		
	}


=======
class Card{
	static String type;
	static String height;
	static int width;
	static double price;
	static String[] color;
	
	
	static void displayDetails(){
		
	System.out.println(type);
	System.out.println(height);
	System.out.println(width);
	System.out.println(price);
	if(color!=null){
		for(int position=0;position<color.length;position++)
			{
			String ref=color[position];
			System.out.println(ref+" "+position);
			}
	}
	else{
	System.out.println("Array is null");
	}
		
	}


>>>>>>> f7a18ce8db584a40633386e272fc6afcf9abc231
}