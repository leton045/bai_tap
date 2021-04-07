import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

// Câu 2: Viết chương trình quản lý nhân viên. Thực hiện các công việc sau:

// Tạo class Employee chứa:

// Thuộc tính: id, name, dateOfBirth, address, position, basicSalary

// Phương thức: constructor, các phương thức getter và setter, phương thức để nhập và xuất thông tin.

// Thêm phương thức salaryCalculator để tính lương, biết: salary = basicSalary + (100.000*số giờ tăng ca)




public class Employee {
    private int id;
    private String name;
    private int dateOfBirth;
    private String address;
    private String position;
    private long basicSalary;
    int time;
    public Employee() {
    }
    public Employee(int id, String name, int dateOfBirth, String address, String position, Long basicSalary) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public String getName (){
        return name;
    }
    public void setName (String name) {this.name = name;}

    public int getId () { return id;}
    public void setId (int id) { this.id = id;}

    public int getDateOfBrirth () { return dateOfBirth;}
    public void setDateOfBrirth ( int dateOfBirth) { this.dateOfBirth = dateOfBirth;}

    public String getAddress () { return address; }
    public void setAddress ( String address) { this.address = address; }

    public String getPosition ( ) { return position;}
    public void setPositone ( String positon) { this.position = positon;}

    public long getBasicSalary () { return basicSalary; }
    public void setBasicSalary ( long basicSalary) { this.basicSalary = basicSalary; }


    public void input(){
        
        Scanner  sc = new Scanner (System.in);
        System.out.printf("-Name : ");
            name = sc.nextLine();

        System.out.printf("-ID : ");
            id = sc.nextInt();

        System.out.printf("-Date of brirth : ");
            dateOfBirth = sc.nextInt();
            sc.nextLine();

        System.out.printf("-Address : " );
            address = sc.nextLine();

        System.out.printf("Position : ");
            position = sc.nextLine();
        
        System.out.printf("-BasicSalary : ");
            basicSalary = sc.nextLong();
            
        System.out.printf("-Gio tang ca : ");
             time = sc.nextInt();    

    }

    public void display(){
        System.out.println("-Id : " + getId());
        System.out.println("-Name : " + getName());
        System.out.println("-Date of brirth : " + getDateOfBrirth());
        System.out.println("-Address : " + getAddress());
        System.out.println("-Position : " + getPosition());
        System.out.println("-Basic Salary : " + getBasicSalary());

        double salary;
        salary = basicSalary + (100000 * time);
        System.out.println("-Salary " + salary);

        System.out.println();

    }

   
    
}
