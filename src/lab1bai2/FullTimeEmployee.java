package lab1bai2;

public class FullTimeEmployee extends Employee{
	
	private double bonus;
	private double penalty;
	

	public FullTimeEmployee(String id, String name, double basicSalaray, double bonus, double penalty) {
		
		super(id, name, basicSalaray);
		this.bonus = bonus;
		this.penalty = penalty;
	}
	
	public double getBonus() {
		return this.bonus;
		
	}
	
	public void setbonus(double bonus) {
		if(bonus >= 0) {
			this.bonus = bonus;
		}	
	}
	
	public double getPenalty() {
		return this.penalty;
		
	}
	
	public void setpenalty(double penalty) {
		if(penalty >= 0) {
			this.penalty = penalty;
		}
	}
	
	
	@Override
	public double income() {
		return getBasicSalaray() + bonus - penalty;
	}
}
