package lab1bai2;

public class PartTimeEmployee extends Employee {

		private double workingHours;
		private double hourlyRate;
		
		
		public PartTimeEmployee(String id, String name, double basicSalaray, double workingHours, double hourlyRate) {
			super(id, name, basicSalaray);
			this.workingHours = workingHours;
			this.hourlyRate = hourlyRate;
		}
		
		public double getWorkingHours() {
			return this.workingHours;					
		}
		
		public void setWorkingHours(double workingHours) {
			if(workingHours >= 0) {
				this.workingHours = workingHours;
			}
		}	
		public double getHourlyRate() {
			return this.hourlyRate;
		}
		
		public void sethourslyRate(double hourlyRate) {
			if(hourlyRate >=0) {
				this.hourlyRate = hourlyRate;
			}
		}
	
		
	@Override
	public double income() {
		return workingHours * hourlyRate;
	}
	
	public String toString() {
		return super.toString() + " WorkingHours: " + workingHours + " HourlyRate: " + hourlyRate;
	}
}
