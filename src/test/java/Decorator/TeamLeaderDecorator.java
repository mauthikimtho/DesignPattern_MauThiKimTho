package Decorator;

public class TeamLeaderDecorator extends EmployeeDecorator {

	public TeamLeaderDecorator(EmployeeComponent employee) {
		super(employee);
		// TODO Auto-generated constructor stub
	}
	
	public void performTask() {
        super.performTask();
        System.out.println("Nhiệm vụ của Đội trưởng: Đi tuần và gán việc cho nhân viên.");
    }

}
