import java.util.Arrays;

public class Transaction {
	String[] itemList = new String[100];
	private int numberOfItems;
	private double itemPrice;
	private double totalPrice;
	

	public void addItem(String itemName, double itemPrice) {// Start of addProducts method
		itemList[numberOfItems] = itemName + String.valueOf(itemPrice);
		totalPrice = this.totalPrice + itemPrice;
		numberOfItems++;
	} // End of  method
	
	public String[] getItems() {// Start of getProducts method
		return itemList;
	} // End of  method

	public int getNumberOfItems() { // Start of getNumberOfProducts method
		return numberOfItems;
	} // End of method

	public double getItemPrice() {
		return itemPrice;
	} // End of method

	public double getTotalPrice() {
		return this.totalPrice;
	} // End of method
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	} // End of method

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [itemList=" + Arrays.toString(itemList) + ", itemPrice=" + itemPrice + "]";
	}

}
