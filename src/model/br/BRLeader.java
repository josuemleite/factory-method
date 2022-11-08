package model.br;

import model.Employee;

public class BRLeader extends Employee {

	public BRLeader() {
		super("Líder Técnico Brasil");
	}

	@Override
	public double calculateSalary() {
		return 9000;
	}
}
