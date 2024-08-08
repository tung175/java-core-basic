LAB01:
Bài 1:
Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
In ra màn hình với định dạng:
<tên_sinh_viên> có điểm = <điểm>
Gợi ý:
- Chạy spring tool suite để tạo dự án java
- tạo class Lab1Bai1
- tạo hàm main
- Đọc kết quả từ bàn phím:
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
- In kết quả với println:
System.out.println("Your name is: " + name);

Bài 2: Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
Tính toán và in ra console:
- chu vi hình chữ nhật
- diện tích hình chữ nhật
- cạnh nhỏ nhất của hình chữ nhật
Gợi ý:
chu vi = (dài + rộng) x 2
diện tích = dài x rộng

cạnh nhỏ nhất = Math.min(dài, rộng)
Bài 3: Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
Tính và xuất ra thể tích của hình lập phương.
Gợi ý:
thể tích = cạnh x cạnh x cạnh = cạnh^3 = Math.pow(canh, 3)

LAB02
Bài 1: Cho phương trình ax + b = 0
Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình
trên
Gợi ý:
- Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
- Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
- Còn lại: x = -b/a => thông báo x = ?

Bài 2: Cho phương trình: ax^2 + bx + c = 0
Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
trên
Gợi ý:
- Nếu a = 0 => làm tương tự ví dụ bài 1
- Nếu a # 0:
- Tính delta = b^2 - 4ac.
- Nếu delta < 0 => thông báo "phương trình vô nghiệm"
- Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
- Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
x1 = (-b + căn(delta))/(2*a)
x2 = (-b - căn(delta))/(2*a)

Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
Gợi ý:
- Nếu số điện <= 100 => số tiền = số điện x 1000
- Nếu số điện > 100
=> số tiền = 100 * 1000 + (số điện - 100) * 1500

Bài 4: Viết chương trình tổ chức menu:
System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
System.out.println("++ ----------------------------------------- ++");
System.out.println("| 1. Giải phương trình bậc nhất |");
System.out.println("| 2. Giải phương trình bậc hai |");
System.out.println("| 3. Tính số tiền điện |");
System.out.println("| 4. Kết thúc |");
System.out.println("++ ------------------ ++");
Yêu cầu:
- Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên

LAB03
Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
nguyên tố hay không ?
Gợi ý:
- Số nguyên tố là số chỉ chia hết cho 1 và chính nó (tối đa 2 ước)
- Dùng vòng lặp (2, Số nguyên -1). Nếu số nguyên chia hết cho i => ko là số nguyên tố
- Sử dụng toán tử % để biết có chia hết hay không ?

Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ
Gợi ý:
- Dùng vòng lặp từ 1 tới 10
sysout(" %d x %d = %d ", x, i, x*i)

Bài 3: Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
- Sắp xếp và xuất mảng vừa nhập ra màn hình
- Xuất phần tử có giá trị nhỏ nhất
- Xuất phần tử có giá trị lớn nhất
Gợi ý:
- Sử dụng Arrays.sort
- Sử dụng Math.min, Math.max

LAB04
Bài 1:
- Tạo class với yêu cầu ở trên, đặt tên là Product.java
- khai báo các thuộc tính: name, price, tax
- Tạo thêm 2 method cho class trên:
+ nhapThongTin(): void (dùng để nhập thông tin object)
+ xuatThongTin(): void (in ra thông tin object đã tạo)
+ getTaxPrice(): double
số tiền thuế = price * tax

Bài 2: Kế thừa bài 1, và bổ sung thêm:
- Trong hàm main, tạo 2 object Products và in thông tin ra màn hình
=> sử dụng constructor

Bài 3: Kế thừa bài tập 2, bổ sung thêm:
+ getter/setter
+ sử dụng keyword private

LAB05
Bài 1:
Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa
nhập và tính tổng của nó
Gợi ý: sử dụng ArrayList<double> để lưu trữ
//nhập số lượng tùy thích
While(true){
Double x = scanner.nextDouble();
list.add(x);
sysout("Nhập thêm (Y/N))?
if(scanner.nextLine().equals("N"){ // why using equals ?
break;
} }
//tính tổng = vòng lặp for

LAB06
Viết các hàm để check String:
- Số CCCD : chỉ gồm ký tự số, chứa 12 ký tự, không chứa ký tự là chữ số hoặc ký tự đặc
biệt
Ví dụ hợp lệ: 099145697413
không hợp lệ: 09914569741a (chứa ký tự là chữ số)
- Mật khẩu: có ít nhất 6 ký tự
ví dụ hợp lệ: 123456
không hợp lệ: 12345 (chứa 5 ký tự)
- Email : cần có ký tự @ và dấu chấm (.)
ví dụ hợp lệ: eric@hoidanit.com.vn
không hợp lệ: abc#blabla (không chứa @ và dấu chấm)

LAB07
Tạo 3 class:
- SinhVien (super class)
+ getDiem (phương thức trừu tượng)
- SinhVienIT (child class)
+ scoreJava : double
+ scoreHTML : double
getDiem = (scoreJava * 2 + scoreHTML)/3;
- SinhVienCoKhi (child class)
+ scoreCNC : double
+ scorePLC : double
getDiem = (scoreCNC + scorePLC)/2;

LAB08
- Tạo interface IPerson với 2 method:
+ void input( )
+ void display( )
- Tạo class Person kế thừa interface ở trên, và có thêm:
protected String id;
protected String name;
protected int age;
+ viết constructor, setter, getter
- Tạo class Student kế thừa class Person, và có thêm:
private int mark;
private String grade;
+ viết getter cho mark, grade
+ viết setter cho mark
+ viết setter cho grade theo công thức:
nếu mark >=8 thì grade = "A"
nếu mark >=7 thì grade = "B"
nếu mark >=6 thì grade = "C"
nếu mark >=5 thì grade = "D"
nếu mark <5 thì grade = "Tạch cmnr"

LAB09
Tạo class SinhVien bao gồm:
masv: String
hoten: String
diem: double
age: int
- Viết setter, getter, constructor, toString
- Nhập dữ liệu sinh viên từ bàn phím và in ra màn hình (với hàm toString)
- Xử lý ngoại lệ cho các trường hợp
+ 0< điểm < 10. điểm là số thực
+ 18 < age < 100. tuổi là số nguyên
=> nếu có ngoại lệ thì thông báo lỗi và yêu cầu nhập lại
