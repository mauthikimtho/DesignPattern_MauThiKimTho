package Decorator;

public class ChiefAccountantDecorator extends EmployeeDecorator{

	public ChiefAccountantDecorator(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}
	public void performTask() {
        super.performTask();
        System.out.println("Nhiệm vụ của Kế toán trưởng: Quản lý tài chính và lập báo cáo.");
    }

}
