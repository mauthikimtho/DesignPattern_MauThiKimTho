# Quản lý Chức vụ Employee - 4 Cách Tiếp Cận

## Mô tả Bài Toán
Bài tập yêu cầu xây dựng mô hình quản lý chức vụ nhân viên (**Employee**) với các nhiệm vụ tương ứng. Chúng ta sẽ triển khai theo 4 cách khác nhau:

1. **No Pattern** - Cách triển khai thông thường.
2. **State Pattern** - Sử dụng mẫu thiết kế Trạng thái.
3. **Strategy Pattern** - Sử dụng mẫu thiết kế Chiến lược.
4. **Decorator Pattern** - Sử dụng mẫu thiết kế Trang trí.

## 1. No Pattern (Cách triển khai thông thường)
Các chức vụ được lựa chọn dựa trên **enum** và xử lý trong một phương thức duy nhất sử dụng **switch-case**.

### Nhược điểm:
- Dễ hiểu, dễ triển khai.
- Không cần nhiều class.

### Hạn chế:
- Càng nhiều chức vụ, code càng rối rắm.
- Không linh hoạt nếu có thay đổi logic.

---

## 2. State Pattern
Mỗi chức vụ được biểu diễn bằng một lớp **trạng thái** riêng, giúp thay đổi hành vi Employee dựa trên trạng thái hiện tại.

### Nhược điểm:
- Linh hoạt khi thay đổi hành vi Employee.
- Giảm sử dụng **if-else** và **switch-case**.

### Hạn chế:
- Cần nhiều class, làm tăng độ phức tạp.

---

## 3. Strategy Pattern
Sử dụng interface **EmployeeStrategy** và các class triển khai tương ứng với từng chức vụ.

### Nhược điểm:
- Dễ mở rộng và tùy chỉnh.
- Code dễ bảo trì.

### Hạn chế:
- Cần nhiều class, code phức tạp hơn.

---

## 4. Decorator Pattern
Thay vì thay đổi trực tiếp Employee, ta dùng **Decorator** để "trang trí" thêm hành vi cho Employee.

### Nhược điểm:
- Két hợp nhiều chức vụ linh hoạt.
- Dễ thay đổi hành vi Employee mà không ảnh hưởng đến các class khác.

### Hạn chế:
- Càng nhiều Decorator, code càng phức tạp.

---

## Kết Luận
Bài tập này giúp hiểu rõ sự khác biệt giữa các mẫu thiết kế và cách lựa chọn pattern phù hợp với từng bài toán.

