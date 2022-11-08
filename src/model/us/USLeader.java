package model.us;

import model.Employee;

public class USLeader extends Employee {

	public USLeader() {
		super("Líder Técnico Americano");
	}

	@Override
	public double calculateSalary() {
		return 9000;
	}
}
