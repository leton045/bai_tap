import java.util.Scanner;

public class Sanpham {
    private  int maSP ;
    private String tenSP;
    private String moTa;
    private long giaNhap;
    private long giaBan;
    private int slTon;
    private int slBan;
    private String hang;
    private String danhMuc;

    

    public Sanpham() {
    }


    public Sanpham(int maSP, String tenSP, String moTa, long giaNhap, long giaBan, int slTon, int slBan, String hang,
            String danhMuc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.slTon = slTon;
        this.slBan = slBan;
        this.hang = hang;
        this.danhMuc = danhMuc;
    }


    public int getMaSP() {
        return maSP;
    }


    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }


    public String getTenSP() {
        return tenSP;
    }


    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }


    public String getMoTa() {
        return moTa;
    }


    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }


    public long getGiaNhap() {
        return giaNhap;
    }


    public void setGiaNhap(long giaNhap) {
        this.giaNhap = giaNhap;
    }


    public long getGiaBan() {
        return giaBan;
    }


    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }


    public int getSlTon() {
        return slTon;
    }


    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }


    public int getSlBan() {
        return slBan;
    }


    public void setSlBan(int slBan) {
        this.slBan = slBan;
    }


    public String getHang() {
        return hang;
    }


    public void setHang(String hang) {
        this.hang = hang;
    }


    public String getDanhMuc() {
        return danhMuc;
    }


    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public void input () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma so : ");
        maSP = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten sp : ");
        tenSP = String.valueOf(sc.nextLine());
        
        System.out.println("Mo ta ");
        moTa = sc.nextLine();
        System.out.println("Nhap gia nhap : ");
        giaNhap = sc.nextLong();
        System.out.println("Nhap gia ban : ");
        giaBan = sc.nextLong();
        System.out.println("Nhap so luong ton  ");
        slTon = sc .nextInt();
        System.out.println("Nhap so luong ban : ");
        slBan = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap hang : ");
        hang = sc.nextLine();
        System.out.println("Nhap danh muc : ");
        danhMuc = sc.nextLine();




       


    }


    @Override
    public String toString() {
        return "Sanpham [danhMuc=" + danhMuc + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", hang=" + hang
                + ", maSP=" + maSP + ", moTa=" + moTa + ", slBan=" + slBan + ", slTon=" + slTon + ", tenSP=" + tenSP
                + "]";
    }


    

}