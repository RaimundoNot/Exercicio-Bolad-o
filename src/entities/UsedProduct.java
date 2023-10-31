package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private  Date manufactureDate;	
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, SimpleDateFormat sdf, Date manufactureDate) {
		super(name, price);
		this.sdf = sdf;
		this.manufactureDate = manufactureDate;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
	@Override
	public String priceTag() {
		return getName() + " (used) $ " + 
		String.format("%.2f", getPrice()) +
		" (Manufacture Date: "+ sdf.format(manufactureDate) + ")";
	}
}
