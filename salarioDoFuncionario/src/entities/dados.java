package entities;

public class dados {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double desconto() {
		return grossSalary - tax;
		
	}
	
	public void acrescimo(double acres) {
		grossSalary += grossSalary * acres / 100;
	}
	
	public String toString() {
	    return name
		+","
		+" $"
		+" "
		+ String.format("%.2f" , desconto() );
	}
}
