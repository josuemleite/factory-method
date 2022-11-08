package model.br;

import model.Employee;

public class BRProgrammer extends Employee {

	public BRProgrammer() {
		super("Programador Brasil");
	}

	@Override
	public double calculateSalary() {
		return 8000;
	}
}
