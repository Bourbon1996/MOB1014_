package lab1;

public class ImportedProduct extends Product {
	
	private  double importTaxRate;
	private double shippingFee;
	
	public ImportedProduct(String id, String name, double basePrice,
			double importTaxRate, double shippingFee) {
		super(id, name, basePrice);
		this.importTaxRate = importTaxRate;
		this.shippingFee = shippingFee;
	}
	
	public double getImportTaxRate() {
		return this.importTaxRate;
	}
	
	public void setImportTaxRate(double importTaxRate) {
		if(importTaxRate >= 0 && importTaxRate <=1) {
			 this.importTaxRate = importTaxRate;
		}else {
			System.out.println("ImportTaxRate must be 0 -> 1");
		}
	}
	
	public double getShippingFee() {
		return this.shippingFee;
		
	}
	
	public void setShippingFee(double shippingFee) {
		if(shippingFee >=0) {
			this.shippingFee = shippingFee;
		}else {
			System.out.println("ShippingFee must be >=0");
		}
	}
	
	@Override
	
	public double finalPrice() {
		return getBasePrice() + getBasePrice() * importTaxRate + shippingFee;
	}
}
