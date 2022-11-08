package model.br;

import model.Employee;

public class BRManager extends Employee {

	public BRManager() {
		super("Gerente Brasil");
	}
	
	@Override
	public double calculateSalary() {
		return 10000;
	}
}
