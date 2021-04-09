import java.util.Scanner;

public abstract class Sach {

    private int maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int namXuatBan;


    public Sach() {
    }


    public Sach ( int maSach, String tenSach, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }


    public int getMaSach() {
        return maSach;
    }


    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }


    public String getTenSach() {
        return tenSach;
    }


    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }


    public String getNhaXuatBan() {
        return nhaXuatBan;
    }


    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }


    public int getNamXuatBan() {
        return namXuatBan;
    }


    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void input(){
        Scanner sc = new Scanner ( System.in);
        System.out.printf("Nhap ma sach : ");
        maSach = sc.nextInt();
        sc.nextLine();
        System.out.printf("Nhap ten sach : ");
        tenSach = sc.nextLine();
        System.out.printf("Nhap Nha xuat ban :");
        nhaXuatBan = sc.nextLine();
        System.out.printf("Nhap nam xuat ban : ");
        namXuatBan = sc.nextInt();
    }

    public void display () {
        System.out.println( "Ma sach :  " + getMaSach() );
        System.out.println( "Ten sach :  " +  getTenSach() );
        System.out.println( "NHa XB : " + getNhaXuatBan() );
        System.out.println( "Nam XB : "  +getNamXuatBan());

    }
    
    
}
