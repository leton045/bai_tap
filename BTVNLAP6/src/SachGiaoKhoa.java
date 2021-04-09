import java.util.Scanner;



public class SachGiaoKhoa extends Sach implements IMuon ,IKho {

    private int soTrang;
    private String tinhTrang;
    private int sLMuon;
    private int tongSL;

    
    public SachGiaoKhoa(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soTrang, String tinhTrang,
            int sLMuon, int tongSL) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.sLMuon = sLMuon;
        this.tongSL = tongSL;
    }


    public SachGiaoKhoa() {
    }


    @Override
    public void viTri() {
       System.out.println( " Nam ke sach thu 2  ");
    }


    @Override
    public int tonKho( ) {
      
     return tongSL - sLMuon;
        
    }


   public int getTongSL (){
       return tongSL;
   }

   public void setTongSL ( int tongSL) {
       this.tongSL = tongSL ;
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


    public int getsLmuon() {
        return sLMuon;
    }


    public void setsLMuon(int sLMuon) {
        this.sLMuon = sLMuon;
    }
    
    @Override
    public void input () {
        super.input();
        Scanner sc = new Scanner ( System.in );
        System.out.printf( "Nhap Tinh trang : ");
        tinhTrang = sc.nextLine();
        System.out.printf( "Nhap so trang : " );
        soTrang = sc.nextInt();
        
        sc.nextLine();
        System.out.printf( "NHap tong so luong : ");
        tongSL = sc.nextInt();
        System.out.printf( "Nhap so luong muon :");
        sLMuon = sc.nextInt();

    }


    @Override
    public void display(){
        super.display();
        System.out.println( "So trang " + getSoTrang() );
        System.out.println( "Tinh trang sach :  " + getTinhTrang() );
        System.out.println( "TOng so luong : " + getTongSL() );
        System.out.println( "So luong muon : " + getsLmuon() );
        System.out.println( "ton : " + tonKho());


    }
    
    
}
