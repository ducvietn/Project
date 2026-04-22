1) Các trách nhiệm mà StudentManager đang gánh
- StudentManager hiện đang làm ít nhất 6 việc:
  + Quản lý thông tin sinh viên: studentId, name, gpa
  + Quản lý thông tin môn học: courseId, courseName, credits
  + Quản lý điểm thành phần: midtermScore, finalScore, assignmentScore
  + Tính điểm tổng kết: calculateFinalGrade()
  + Xếp loại học lực: getAcademicStatus()
  + In bảng điểm / trình bày output: printTranscript()


3) Vì TeachingAssistant cũng có id và name, nhưng không có gpa, nên không nên nhét gpa vào một class cha chung rồi để mang theo một thuộc tính vô nghĩa.
Giải pháp hợp lý là:
- tạo class cha Person chỉ chứa phần chung : id,name
- Student extends Person và thêm gpa
- TeachingAssistant extends Person: không có gpa
