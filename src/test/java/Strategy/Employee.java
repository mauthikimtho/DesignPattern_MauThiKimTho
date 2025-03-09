package Strategy;

import java.util.Scanner;

public class Employee {
    private EmployeeStrategy strategy;

    public void setStrategy(EmployeeStrategy strategy) {
        this.strategy = strategy;
    }

    public void performTask() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("Chức vụ không hợp lệ.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        // Danh sách chiến lược tương ứng với từng chức vụ
        EmployeeStrategy[] strategies = {
            new TeamLeaderStrategy(),
            new DirectorStrategy(),
            new OfficeStaffStrategy(),
            new WorkshopStaffStrategy(),
            new ChiefAccountantStrategy()
        };

        String[] positions = {"Đội trưởng", "Giám đốc", "Nhân viên VP", "Nhân viên Xưởng", "Kế toán trưởng"};

        while (true) {
            System.out.println("----STRATEGY---- Chọn chức vụ:");
            for (int i = 0; i < positions.length; i++) {
                System.out.println((i + 1) + ". " + positions[i]);
            }
            System.out.print("Nhập lựa chọn (1-" + positions.length + ") hoặc 0 để thoát: ");
            
            // Kiểm tra đầu vào có phải số nguyên không
            if (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
                scanner.next(); // Bỏ qua đầu vào không hợp lệ
                continue;
            }

            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Thoát chương trình.");
                break;
            } else if (choice >= 1 && choice <= positions.length) {
                employee.setStrategy(strategies[choice - 1]);
                employee.performTask();
            } else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
        scanner.close();
    }
}