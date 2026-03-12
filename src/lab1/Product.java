package lab1;

public class Product {
	private String id;
	private String name;
	private double basePrice;
	
	// Khởi tạo Constructor
	public Product(String id, String name, double basePrice) {
		this.id = id;
		this.name = name;
		this.basePrice = basePrice;
	}	
	// Khởi tạo getter, setter
		
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		if(id.isEmpty()) {
			System.out.println("Id không được để trống");
			}else{
				this.id = id;
			}
					
					
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBasePrice() {
		return this.basePrice;
	}
	
	public void setBasePrice(double basePrice) {
		if(basePrice >=0) {
			this.basePrice = basePrice;
		}else {
			System.out.println("Giá phải >= 0 vui lòng nhập lại");
		}
	}
	
	// Method finalPrice = basePrice
	public double finalPrice() {
		return basePrice;
	}
	
	// Method toString( dùng để in thông tin object )
	
	@Override
	public String toString() {
		return "ID: " + id + "Name: " + name + "BasePrice: " + basePrice;
	}
}
	
	
	

