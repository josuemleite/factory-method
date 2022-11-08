package model.us;

import model.Employee;

public class USProgrammer extends Employee {

	public USProgrammer() {
		super("Programador Americano");
	}

	@Override
	public double calculateSalary() {
		return 8000;
	}
}
