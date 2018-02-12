
public class Chips extends Snack {
	// Constructor without arguments
	public Chips() {
		super.setCompanyName("Frito Lay");
		super.setBrandName("Lays");
		super.setOunces(1.0);
		super.setPrice(1.0);
		super.setCost(0.20);
	}
	
	// Constructor with arguments
	public Chips(String companyName,  String brandName,  double ounces,  double price,  double cost) {
		super.setCompanyName(companyName);
		super.setBrandName(brandName);
		super.setOunces(ounces);
		super.setPrice(price);
		super.setCost(cost);
		super.setCost(super.getPrice() / super.getOunces());
	}
	
	// Constructor to copy product
	public Chips(Chips copyChips) {
		super.setCompanyName(copyChips.getCompanyName());
		super.setBrandName(copyChips.getBrandName());
		super.setOunces(copyChips.getOunces());
		super.setPrice(copyChips.getPrice());
		super.setCost(copyChips.getCost());
	}

	// Override toString() method
	@Override
	public String toString() {
		return "Chips" + super.toString() + "]";
	}
}
