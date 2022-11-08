package model.us;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeFactory.EMPLOYEE_TYPE;

public class USEmployeeFactory extends EmployeeFactory {

	@Override
	public Employee createEmployee(EMPLOYEE_TYPE employeeType) {
		
		if (employeeType == EMPLOYEE_TYPE.MANAGER)
			return new USManager();
		
		if (employeeType == EMPLOYEE_TYPE.PROGRAMMER)
			return new USProgrammer();
		
		return new USLeader();
	}
}