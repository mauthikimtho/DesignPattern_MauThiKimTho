package nodesignpattern;

import java.util.Scanner;

public class Employee {
    private Position position;

    public Employee(Position position) {
        this.position = position;
    }

    public void handleRequest() {
        switch (position) {
            case TEAM_LEADER:
                System.out.println("Nhiệm vụ của Đội trưởng: Đi tuần và gán việc cho nhân viên.");
                break;
            case DIRECTOR:
                System.out.println("Nhiệm vụ của Giám đốc: Xem xét kế hoạch và đưa ra quyết định.");
                break;
            case OFFICE_STAFF:
                System.out.println("Nhiệm vụ của Nhân viên VP: Pha chế và kiểm tra công việc văn phòng.");
                break;
            case WORKSHOP_STAFF:
                System.out.println("Nhiệm vụ của Nhân viên Xưởng: Làm việc tại xưởng và vận hành máy móc.");
                break;
            case CHIEF_ACCOUNTANT:
                System.out.println("Nhiệm vụ của Kế toán trưởng: Quản lý tài chính và lập báo cáo.");
                break;
            default:
                System.out.println("Chức vụ không hợp lệ.");
        }
    }

    public enum Position {
        TEAM_LEADER("Đội trưởng"),
        DIRECTOR("Giám đốc"),
        OFFICE_STAFF("Nhân viên VP"),
        WORKSHOP_STAFF("Nhân viên Xưởng"),
        CHIEF_ACCOUNTANT("Kế toán trưởng");

        private final String title;

        Position(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Position[] positions = Position.values();
        while (true) {
            System.out.println("-----No pattern----Chọn chức vụ:");
            for (int i = 0; i < positions.length; i++) {
                System.out.println((i + 1) + ". " + positions[i].getTitle());
            }
            System.out.print("Nhập lựa chọn (1-" + positions.length + ") hoặc 0 để thoát: ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Thoát chương trình.");
                break;
            } else if (choice >= 1 && choice <= positions.length) {
                Employee employee = new Employee(positions[choice - 1]);
                employee.handleRequest();
            } else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
        scanner.close();
    }
}
