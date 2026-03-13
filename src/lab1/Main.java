package lab1;

public class Main {
	public static void main(String[] args) {
		
		Product sp1 = new Product("SP1", "Nước Ngọt", 15000);
		Product sp2 = new Product("SP2" ,"Bánh Kẹo", 10000);
		Product sp3 = new Product("SP3", "Đồ ăn vặt", 50000);
		
		ImportedProduct sp4 = new ImportedProduct("SP4", "Coffe", 25000, 0.5, 5000);
		ImportedProduct sp5 = new ImportedProduct("SP5", "Thuốc lá", 30000, 0.8, 5000);
		
		Product [] list = {sp1, sp2, sp3, sp4, sp5};
		
		// dùng for each để duyệt và in ra trong toString
		
		for(Product x : list) {
			System.out.println(x);
		}
		
		
		// Tìm sản phẩm có giá cao nhất 
		
		Product max = list[0];
		
		for(Product x : list) {
			if(x.finalPrice() > max.finalPrice()) {
				max = x;
			}
		}
		
		System.out.println("The most expensive product");
		System.out.println(max);
	}
}
