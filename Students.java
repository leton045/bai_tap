import java.io.ObjectOutputStream.PutField;
import java.util.Scanner;

public class Students {
    public int id;
    public String name;
    public double diemLyThuyet;
    public double diemThucHanh;
    

    public static String school = " Techmaster";

    public Students() {
    }

    public Students(int id, String name, double diemLyThuyet, double diemThucHanh) {
        this.id = id;
        this.name = name;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;

    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id : ");
        id= sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten : ");
        name= sc.nextLine();
        System.out.println("Nhap Diem ly thuyet = ");
        diemLyThuyet = sc.nextDouble();
        System.out.println("Nhap diem thuc hanh = ");
        diemThucHanh = sc.nextDouble();
        

        System.out.println();
    }
    


    public void display3(){
        System.out.println("id= " + id);
        System.out.println("name : " + name);
        System.out.println("diem thuc haanh :" + diemThucHanh);
        System.out.println("diem ly thuyet :" + diemLyThuyet);
       double diemTB;
       diemTB = (diemLyThuyet + diemThucHanh)/2;
       System.out.println("Diem TB = " + diemTB);
       
        System.out.println("scholl" + school);
        System.out.println();
    }
    
}
