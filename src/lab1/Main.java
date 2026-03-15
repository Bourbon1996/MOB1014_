package lab1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
//		Product sp1 = new Product("SP1", "Nước Ngọt", 15000);
//		Product sp2 = new Product("SP2" ,"Bánh Kẹo", 10000);
//		Product sp3 = new Product("SP3", "Đồ ăn vặt", 50000);
//		
//		ImportedProduct sp4 = new ImportedProduct("SP4", "Coffe", 25000, 0.5, 5000);
//		ImportedProduct sp5 = new ImportedProduct("SP5", "Thuốc lá", 30000, 0.8, 5000);
//		
//		Product [] list = {sp1, sp2, sp3, sp4, sp5};
//		
//		// dùng for each để duyệt và in ra trong toString
//		
//		for(Product x : list) {
//			System.out.println(x);
//		}
//		
//		
//		// Tìm sản phẩm có giá cao nhất 
//		
//		Product max = list[0];
//		
//		for(Product x : list) {
//			if(x.finalPrice() > max.finalPrice()) {
//				max = x;
//			}
//		}
//		
//		System.out.println("The most expensive product");
//		System.out.println(max);
		
		
//		ArrayList<Product> list = new ArrayList<Product>();
//		
//		// tạo 5 sản phẩm 
//		
//		// cách 1 nhâp trực tiếp sau đó add vào list
//		Product sp1 = new Product("SP1", "Nước Ngọt", 15 );
//		list.add(sp1);
//		
//		// hoặc add và nhập trong add
//		list.add(new Product ("SP2", "Bánh Kẹo", 10));
//		list.add(new Product ("SP3", "Đồ Ăn Vặt", 5));
//		
//		list.add(new ImportedProduct("SP4", "Coffe", 25, 0.1, 1));
//		list.add(new ImportedProduct("SP5", "Thuốc Lá", 10, 0.5, 1));
//		
//		for(Product x : list) {
//			System.out.println(x.toString());
//		}
//		
//		Product max = list.get(0);
//		
//		for(Product x : list) {
//			if(x.finalPrice() > max.finalPrice()) {
//				max = x;
//			}
//		}
//		
//		System.out.println("The most expensive product");
//		System.out.println(max);
//	
		ArrayList<Product> dsProduct = new ArrayList<Product>();
        
        // Khởi tạo sản phẩm thứ nhất
        ImportedProduct iP = new ImportedProduct();
        iP.setId("Ao01");
        iP.setName("Ao thun");
        iP.setBasePrice(10);
        iP.setImportTaxRate(0.1);
        iP.setShippingFee(2);
        dsProduct.add(iP);

        // Khởi tạo sản phẩm thứ hai
        ImportedProduct iP2 = new ImportedProduct();
        iP2.setId("Ao02");
        iP2.setName("Ao so mi");
        iP2.setBasePrice(12);
        iP2.setImportTaxRate(0.15);
        iP2.setShippingFee(1);
        dsProduct.add(iP2);

        /* // Đoạn code này đang bị comment (vô hiệu hóa)
        for(int i=0; i<2; i++) {
            ImportedProductDAO p3 = new ImportedProductDAO();
            p3.NewImportedProduct();
            dsProduct.add(p3);
        }
        */

        // Vòng lặp in danh sách sản phẩm
        for (Product p : dsProduct) {
            System.out.println(p.toString());
        }
 

//		
	}
}
