import java.util.Scanner;

public class DoAn extends Sach implements IKho {
    private int soTrang;
    private String tinhTrang;
    private int namBaoVe;



    public DoAn(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soTrang, String tinhTrang,
            int namBaoVe) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.namBaoVe = namBaoVe;
    }



    public DoAn() {
    }


    @Override
    public void viTri() {
        System.out.println("Nam o day 4 ");
        
    }



    public int getSoTrang() {
        return soTrang;
    }



    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }



    public String getTinhTrang() {
        return tinhTrang;
    }



    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }



    public int getNamBaoVe() {
        return namBaoVe;
    }



    public void setNamBaoVe(int namBaoVe) {
        this.namBaoVe = namBaoVe;
    }

    @Override
    public void input() {
        
        super.input();
        Scanner sc = new Scanner ( System.in );
        System.out.printf( "Nhap so trang : " );
            soTrang = sc.nextInt();
            sc.nextLine();
        System.out.printf( "Nhap Tinh trang : " );
            tinhTrang = sc.nextLine() ;
        System.out.printf( "Nhap nam bao ve : " );
            namBaoVe = sc.nextInt();
    }

    @Override
    public void display() {
        
        super.display();
        System.out.println( "So trang : " + getSoTrang() );
        System.out.println( "Tinh trang : " + getTinhTrang() );
        System.out.println( "Nam bao ve : " + getNamBaoVe() );
        
        
    }



   

    

    


    


    
}
