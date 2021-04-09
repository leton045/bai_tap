import java.util.Scanner;



public class Tailieudientu extends Sach implements IDownload {

    private int dungLuong;
    private long giaThanh;
    private int luotTai;


    public Tailieudientu(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, int dungLuong, long giaThanh,
            int luotTai) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan);
        this.dungLuong = dungLuong;
        this.giaThanh = giaThanh;
        this.luotTai = luotTai;
    }


    public Tailieudientu() {
    }


    public int getDungLuong() {
        return dungLuong;
    }


    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }


    public long getGiaThanh() {
        return giaThanh;
    }


    public void setGiaThanh(long giaThanh) {
        this.giaThanh = giaThanh;
    }


    public int getluotTai() {
        return luotTai;
    }


    public void setluotTai(int luotTai) {
        this.luotTai = luotTai;
    }


    @Override
    public long tongTien() {
       
        return luotTai *giaThanh;
       
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner ( System .in );
        System.out.println( "Nhap dung luong : ");
        dungLuong = sc.nextInt();
        System.out.println( "Nhap gia thanh : " );
        giaThanh = sc .nextLong();
        System.out.println( "Nhap luot tai : " );
        luotTai = sc.nextInt();

    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        System.out.println( "Dung luong : " + getDungLuong() );
        System.out.println( "Gia thanh : " + getGiaThanh() );
        System.out.println( "Luot tai : " + getluotTai() );
        System.out.println( "Tong tien : " + tongTien());
        
    }


  

    


    
}
