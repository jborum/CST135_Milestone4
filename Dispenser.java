import java.util.Arrays;

public class Dispenser {
	//private String[] productsArray = new String[100];
	private Product[] productsArray = new Product[100];
	private int numberOfProducts;

	public Dispenser() {

		// Create Products to store in the dispenser
		Product drink1 = new Drink("Pepsi Co.", "Pepsi",12, 2.0,0.35);
		Product drink2 = new Drink("Pepsi Co.", "Mountain Dew",12, 2.0,0.35);
		Product drink3 = new Drink("Pepsi Co.", "Dr. Pepper",12, 2.0,0.35);
		Product drink4 = new Drink("Pepsi Co.", "Sierra Mist",12, 2.0,0.35);
		
		Product candy1 = new Candy("Mars, Inc.", "M&M",3.0, 1.5,0.13);
		Product candy2 = new Candy("Mars, Inc.", "KitKat",3.0, 1.5,0.13);
		Product candy3 = new Candy("Nestle", "Crunch",3.0, 1.5,0.13);
		Product candy4 = new Candy("Mars, Inc.", "Twix",3.0, 1.5,0.13);
		
		Product chips1 = new Chips("Frito Lay", "Classic Lays",1.0, 1.0,0.22);
		Product chips2 = new Chips("Frito Lay", "Flamin'Hot Lays",1.0, 1.0,0.22);
		Product chips3 = new Chips("Frito Lay", "Crunchy Cheetos",1.0, 1.0,0.22);
		Product chips4 = new Chips("Frito Lay", "Flamin;Hot Cheetos",1.0, 1.0,0.22);
		
		Product gum1 = new Gum("Wrigley", "Juicy Fruit",0.25, 1.0,0.03);
		Product gum2 = new Gum("Wrigley", "Doublement",0.25, 1.0,0.03);
		Product gum3 = new Gum("Wrigley", "Big Red",0.25, 1.0,0.03);
		Product gum4 = new Gum("Wrigley", "Bubble Yum Cotton Candy",0.25, 1.0,0.03);
		
		//add products strings to dispenser
		this.addProduct(drink1);
		this.addProduct(drink2);
		this.addProduct(drink3);
		this.addProduct(drink4);
		this.addProduct(candy1);
		this.addProduct(candy2);
		this.addProduct(candy3);
		this.addProduct(candy4);
		this.addProduct(chips1);
		this.addProduct(chips2);
		this.addProduct(chips3);
		this.addProduct(chips4);
		this.addProduct(gum1);
		this.addProduct(gum2);
		this.addProduct(gum3);
		this.addProduct(gum4);
	} // End of dispenser constructor
		
	// display products method
	public void displayProducts() {
		int x = 1;
		for (int i = 0; i < this.getNumberOfProducts(); i++) { // start of loop
			System.out.println(x++ + " - " + productsArray[i].toString()); // print values of the players array
		} // End of For Loop
	}

	public void addProduct(Product product) {// Start of addProducts method
		productsArray[numberOfProducts] = product;
		numberOfProducts++;
	} // End of addProducts method
	
	public Product[] getProducts() {// Start of getProducts method
		return productsArray;
	} // End of getProducts method

	public int getNumberOfProducts() { // Start of getNumberOfProducts method
		return numberOfProducts;
	} // End of getNumberOfProducts method

	// toString Method
	@Override
	public String toString() { // Start of toString Method
		return "Dispenser Products [Products=" + Arrays.toString(productsArray) + ", Number of Products="
				+ numberOfProducts + "]";
	} // End of toString method
			
} // End of Dispenser Class

