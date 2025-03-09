package State;

import java.util.Scanner;

public class Employee {
	private EmployeeState state;

    public void setState(EmployeeState state) {
        this.state = state;
    }

    public void handleRequest() {
        if (state != null) {
            state.handleRequest();
        } else {
            System.out.println("Chức vụ không hợp lệ.");
        }
    }

    public enum Position {
        TEAM_LEADER("Đội trưởng", new TeamLeaderState()),
        DIRECTOR("Giám đốc", new DirectorState()),
        OFFICE_STAFF("Nhân viên VP", new OfficeStaffState()),
        WORKSHOP_STAFF("Nhân viên Xưởng", new WorkshopStaffState()),
        CHIEF_ACCOUNTANT("Kế toán trưởng", new ChiefAccountantState());

        private final String title;
        private final EmployeeState state;

        Position(String title, EmployeeState state) {
            this.title = title;
            this.state = state;
        }

        public String getTitle() {
            return title;
        }

        public EmployeeState getState() {
            return state;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Position[] positions = Position.values();
        Employee employee = new Employee();

        while (true) {
            System.out.println("State Pattern - Chọn chức vụ:");
            for (int i = 0; i < positions.length; i++) {
                System.out.println((i + 1) + ". " + positions[i].getTitle());
            }
            System.out.print("Nhập lựa chọn (1-" + positions.length + ") hoặc 0 để thoát: ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Thoát chương trình.");
                break;
            } else if (choice >= 1 && choice <= positions.length) {
                employee.setState(positions[choice - 1].getState());
                employee.handleRequest();
            } else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
        scanner.close();
    }
}
