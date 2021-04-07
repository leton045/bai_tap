import java.util.Scanner;

/*Viết chương trình OOP quản lý nhân viên của 1 công ty. Giả sử công ty có 2 loại nhân viên: Lập trình viên và Kiểm chứng viên. Công  ty lưu trữ thông tin của 2 loại nhân viên như sau:

Lập trình viên: mã nhân viên, họ tên, tuổi, số điện thoại, email, lương cơ bản, số giờ overtime.
Kiểm chứng viên: mã nhân viên, họ tên, tuổi, số điện thoại, email, lương cơ bản, số lỗi phát hiện được.
Yêu cầu:

Tạo các thuộc tính tương ứng với kiểu dữ liệu

Tạo constructor và phương thức setter và getter cho các thuộc tính

Tạo phương thức để tính lương mỗi nhân viên, trong đó:

Lương (lập trình viên) = lương cơ bản + số giờ làm thêm * 200.000.
Lương (kiểm chứng viên) = lương cơ bản + số lỗi * 50.000.
Thực hiện nhập vào danh sách nhân viên (Sử dụng Scanner)

In thông tin các nhân viên ra màn hình
*/




public class Employee{
    private int id, age, numberTelephone;
    private  String fullname, email;
    private long salary;

    public Employee () {
    }

    public Employee(int id, int age, int numberTelephone, long salary, String fullname, String email) {
        this.id = id;
        this.age = age;
        this.numberTelephone = numberTelephone;
        this.salary = salary;
        this.fullname = fullname;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(int numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("ID : ");
        id = sc .nextInt();


        System.out.printf("Age : ");
        age = sc.nextInt();

        System.out.printf("Number telephone : ");
        numberTelephone = sc.nextInt();

        System.out.printf("Salary : ");
        salary = sc.nextLong();
        sc.nextLine();

        System.out.printf("Fullname: ");
        fullname = sc.nextLine();

        System.out.printf("Email: ");
        email = sc .nextLine();

        System.out.println();
    }

    public void display () {
        System.out.println(" -- THONG TIN --");
        System.out.println("ID" + getId());
        System.out.println("Full name : " + getFullname());
        System.out.println("Age: " + getAge());
        System.out.println("Number telephone : " + numberTelephone);
        System.out.println("Salary: " + getSalary());
        System.out.println("Email : " + getEmail());
    }

    

    
    


}