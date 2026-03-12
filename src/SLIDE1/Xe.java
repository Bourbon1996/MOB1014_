package SLIDE1;

public class Xe {
	
	private String hangXe;
	private int namSanXuat;
	
	
		public String getHangXe() {
			return this.hangXe;
		}
		
		public void setHangXe(String hangXe) {
			this.hangXe = hangXe;
		}

		public int getNamSanXuat() {
			return namSanXuat;
		}

		public void setNamSanXuat(int namSanXuat) {
			this.namSanXuat = namSanXuat;
		}
		
		public void xuat() {
			System.out.println("Tên Hãng Xe: " + getHangXe() + 
								"\nNăm Sản Xuất: " + getNamSanXuat());
		}

		public Xe(String hangXe, int namSanXuat) {
			this.hangXe  = hangXe;
			this.namSanXuat = namSanXuat;
		}
		
		public Xe() {};
		
}
