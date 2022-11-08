package model.br;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeFactory.EMPLOYEE_TYPE;

public class BREmployeeFactory extends EmployeeFactory {

	@Override
	public Employee createEmployee(EMPLOYEE_TYPE employeeType) {
		
		if (employeeType == EMPLOYEE_TYPE.MANAGER)
			return new BRManager();
		
		if (employeeType == EMPLOYEE_TYPE.PROGRAMMER)
			return new BRProgrammer();
		
		return new BRLeader();
	}
}