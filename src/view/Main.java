package view;

import model.Employee;
import model.EmployeeFactory.EMPLOYEE_TYPE;
import model.br.BREmployeeFactory;
import model.us.USEmployeeFactory;

public class Main {

	public static void main(String[] args) {
		Employee employee = null;

		// Terras brasileiras
		employee = new BREmployeeFactory().createEmployee(EMPLOYEE_TYPE.PROGRAMMER);

		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());

		employee = new BREmployeeFactory().createEmployee(EMPLOYEE_TYPE.LEADER);

		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());

		employee = new BREmployeeFactory().createEmployee(EMPLOYEE_TYPE.MANAGER);

		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());

		// Terras gringas
		employee = new USEmployeeFactory().createEmployee(EMPLOYEE_TYPE.PROGRAMMER);

		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());

		employee = new USEmployeeFactory().createEmployee(EMPLOYEE_TYPE.LEADER);

		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());

		employee = new USEmployeeFactory().createEmployee(EMPLOYEE_TYPE.MANAGER);

		System.out.printf("Cargo: %s, Salário: %.2f\n", employee.getPosition(), employee.calculateSalary());
	}
}
