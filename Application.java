
public class Application {
	 public static void main(String[] args) {
	        Item<String> stringItem = new Item<>();
	        Item<Integer> integerItem = new Item<>();
	        SmallBag<Item> smallBag = new SmallBag<>();

	        stringItem.setE("Ronish Gautam"); 
	        integerItem.setE(123456789);
	        smallBag.setItem(stringItem);
	     	 System.out.println(smallBag.getItem().getE());
	        smallBag.setItem(integerItem);
	        System.out.println(smallBag.getItem().getE());
	      
	       /** Instantiates an Item of type String and sets its value.
	         	Instantiates an Item of type Integer and sets its value.**/
	    }
}
