package model.us;

import model.Employee;

public class USManager extends Employee {

	public USManager() {
		super("Gerente Americano");
	}
	
	@Override
	public double calculateSalary() {
		return 10000;
	}
}
