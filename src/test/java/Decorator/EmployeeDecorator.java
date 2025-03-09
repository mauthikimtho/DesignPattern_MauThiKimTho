package Decorator;

public abstract class EmployeeDecorator implements EmployeeComponent {
	protected EmployeeComponent employee;

    public EmployeeDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }

    public void performTask() {
        employee.performTask();
    }
}
