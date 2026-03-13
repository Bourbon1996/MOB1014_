package lab1bai2;

public class Main {
public static void main(String[] args) {
	
		FullTimeEmployee nv1 = new FullTimeEmployee("NV1", "Nguyễn Văn A", 10000000, 500000, 100000);
		FullTimeEmployee nv2 = new FullTimeEmployee("NV2", "Hoàng Văn B", 15000000, 500000, 0);		
		FullTimeEmployee nv3 = new FullTimeEmployee("NV3", "Lê Thị C", 8000000, 500000, 50000);
		
		PartTimeEmployee nv4 = new PartTimeEmployee("NV4", "Trần Văn D", 8000000, 8, 50000);
		PartTimeEmployee nv5 = new PartTimeEmployee("NV5", "Hồ Văn E", 75000000, 8, 50000);
		
		
		Employee [] list = {nv1, nv2, nv3, nv4, nv5};
		
		for(Employee x : list) {
			System.out.println(x);
		}
		
		Employee max = list[0];
		 for(Employee x : list) {
			 if(x.income() > max.income()) {
				 max = x;
			 }
		 }
		 
		 System.out.println("Highest income");
		 System.out.println(max);
	}
}