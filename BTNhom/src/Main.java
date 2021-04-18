import java.util.ArrayList;

public class Main {
    public static Quanlysp quanlysp= new Quanlysp();
    public static void main(String[] args) {
        ArrayList<Sanpham> sanphams= quanlysp.themSP();
        quanlysp.laySP(sanphams);
        quanlysp.layTheoDanhMuc(sanphams);
        quanlysp.layTheoHang(sanphams);
        quanlysp.inThongTinGiaVaDanhMuc(sanphams);
    }
    
}
