package model;

import model.EmployeeFactory.EMPLOYEE_TYPE;

public abstract class EmployeeFactory {
	
	public enum EMPLOYEE_REGION {
		BR,
		US;
	}
	
	public enum EMPLOYEE_TYPE {
		MANAGER,
		PROGRAMMER,
		LEADER;
	}
	
	public abstract Employee createEmployee(EMPLOYEE_TYPE employeeType);
}