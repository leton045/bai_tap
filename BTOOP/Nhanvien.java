import java.util.Scanner;

public class Nhanvien extends Canbo {
    private String congViec ;

    public Nhanvien(String name, int age, String gender, String address, String congViec) {
        super(name, age, gender, address);
        this.congViec = congViec;
    }

    public Nhanvien() {
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override 
    public void input(){
        super.input();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap CV cua Nhan vien : ");
        congViec = String .valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return   "Nhanvien ["+ super.toString() +"congViec=" + congViec + "]";
    }

    

    
    
}
