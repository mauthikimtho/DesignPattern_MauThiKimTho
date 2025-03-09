package Decorator;

public class OfficeStaffDecorator extends EmployeeDecorator{

	public OfficeStaffDecorator(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}
	
	public void performTask() {
        super.performTask();
        System.out.println("Nhiệm vụ của Nhân viên VP: Pha chế và kiểm tra công việc văn phòng.");
    }

}
