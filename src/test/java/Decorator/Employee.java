package Decorator;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] positions = {"Đội trưởng", "Giám đốc", "Nhân viên VP", "Nhân viên Xưởng", "Kế toán trưởng"};

        while (true) {
            System.out.println("----DECORATOR---- Chọn chức vụ:");
            for (int i = 0; i < positions.length; i++) {
                System.out.println((i + 1) + ". " + positions[i]);
            }
            System.out.print("Nhập lựa chọn (1-" + positions.length + ") hoặc 0 để thoát: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
                scanner.next(); 
                continue;
            }

            int choice = scanner.nextInt();
            
            if (choice == 0) {
                System.out.println("Thoát chương trình.");
                break;
            }

            EmployeeComponent employee = new BaseEmployee();

            switch (choice) {
                case 1:
                    employee = new TeamLeaderDecorator(employee);
                    break;
                case 2:
                    employee = new DirectorDecorator(employee);
                    break;
                case 3:
                    employee = new OfficeStaffDecorator(employee);
                    break;
                case 4:
                    employee = new WorkshopStaffDecorator(employee);
                    break;
                case 5:
                    employee = new ChiefAccountantDecorator(employee);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    continue;
            }

            employee.performTask();
        }

        scanner.close();
    }

}
