import java.util.Scanner;

public class Kysu extends Canbo {
    private String nganhDT;

    public Kysu(String name, int age, String gender, String address, String nganhDT) {
        super(name, age, gender, address);
        this.nganhDT = nganhDT;
    }

    public Kysu() {
    }

    public String getNganhDT() {
        return nganhDT;
    }

    public void setNganhDT(String nganhDT) {
        this.nganhDT = nganhDT;
    }

    @Override
    public void input ( ) {
        super.input();
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap Nganh dao tao : ");
        nganhDT = String .valueOf(sc.nextLine());
        
    }

    @Override
    public String toString() {
        return   "Kysu ["+super.toString()+"nganhDT=" + nganhDT + "]";
    }

    
    
}
