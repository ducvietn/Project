Ý tưởng bài toán Fibonacci:

Nếu n < 0: trả về -1
Nếu n = 0: trả về 0 (F(0) = 0)
Nếu n = 1: trả về 1 (F(1) = 1)
Dùng 2 biến prev2 và prev1 lưu 2 số trước (prev2 = F(n - 2) , prev1 = F(n - 1))
Dùng vòng lặp for, bắt đầu từ i = 2 (vì đã lưu sẵn 2 giá trị đầu):
  Kiểm tra tràn số: Nếu Long.MAX_VALUE - prev1 < prev2 thì trả về Long.MAX_VALUE
  Giá trị hiện tại current = prev2 + prev1
  Sau mỗi vòng lặp thì prev2 = prev1 và prev1 = current
Khi kết thúc vòng lặp for thì prev1 luôn bằng current => trả về prev1 = số fibonacci thứ n
