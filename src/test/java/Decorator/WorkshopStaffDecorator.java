package Decorator;

public class WorkshopStaffDecorator extends EmployeeDecorator{

	public WorkshopStaffDecorator(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}
	
	public void performTask() {
        super.performTask();
        System.out.println("Nhiệm vụ của Nhân viên Xưởng: Làm việc tại xưởng và vận hành máy móc.");
    }

}
