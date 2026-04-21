Đoạn A: 
 * Code smell: 
  - Poor Naming: tên biến t, h, r, m, f quá ngắn, khó hiểu.
  - Magic Number: 0.9 xuất hiện trực tiếp trong code.
  - Unused Parameter: tham số t không được dùng.
 * Vì sao là vấn đề: 
  - Khó đọc, khó bảo trì.
  - Người khác nhìn vào không biết m là gì, r là gì.
  - Số 0.9 không nói rõ ý nghĩa là giảm giá thành viên hay gì khác.
  - t làm rối API vì truyền vào nhưng không có tác dụng.
 * Refactor phù hợp:
  - Rename variables
  - Replace Magic Number with Constant
  - Nếu được phép đổi API thì Remove Parameter với t


Đoạn B
 * Code smell:
  - Large Class / God Class
  - Violation of Single Responsibility Principle
 * Vì sao là vấn đề:
  - UserService đang làm quá nhiều việc:
   + tìm user
   + gửi email chào mừng
   + gửi email reset mật khẩu
   + render profile
   + export CSV
 * Refactor phù hợp
  - Extract Class
  - Tách mỗi trách nhiệm sang một class riêng

Đoạn C:
 * Code smell:
  - Switch/Conditional Complexity (ở đây là chuỗi if theo loại hình)
  - Primitive Obsession: dùng String shapeType để quyết định hành vi
  - Magic Number: 3.14159
 * Vì sao là vấn đề:
  - Mỗi lần thêm hình mới lại phải sửa hàm getArea, vi phạm nguyên tắc Open/Closed Principle.
  - Dùng chuỗi "rectangle", "triangle", "circle" rất dễ gõ sai.
 * Refactor phù hợp
  - Replace Conditional with Polymorphism
  - Extract Constant


Đoạn D:
 * Code smell:
  - Data Clumps
  - Có dấu hiệu nên Extract Class
 * Vì sao là vấn đề:
  - Các thuộc tính:
   + authorEmail
   + authorName
   + authorPhone
   + authorAddress
  luôn đi cùng nhau, tạo thành một nhóm dữ liệu logic: Author.

 * Refactor phù hợp
  - Extract Class
