package Decorator;

public class DirectorDecorator extends EmployeeDecorator {

	public DirectorDecorator(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}

	public void performTask() {
        super.performTask();
        System.out.println("Nhiệm vụ của Giám đốc: Xem xét kế hoạch và đưa ra quyết định.");
    }
}
