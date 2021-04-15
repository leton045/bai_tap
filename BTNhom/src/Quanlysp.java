import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Quanlysp {
    ArrayList<Sanpham> listSP = new ArrayList<>();
    Scanner sc= new Scanner(System.in);

    public ArrayList<Sanpham> themSP (){
        System.out.println("Nhập số lượng sản phẩm:");
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            Sanpham sp= new Sanpham();
            sp.input();
            listSP.add(sp);
        }
        return listSP;
    }

    public void laySP (ArrayList<Sanpham> listSP){
        System.out.println("Thông tin sản phẩm:");
        for(int i=0; i<listSP.size(); i++){
            Sanpham sanpham= listSP.get(i);
          System.out.println(sanpham.toString());  
        }
    }


    public void layTheoDanhMuc(ArrayList<Sanpham> list){
        System.out.println("Nhập danh mục muốn chọn:");
        System.out.println("1. Điện thoại");
        System.out.println("2. Laptop");
        System.out.println("3. Apple");
        System.out.println("4. Phụ kiện");
        int chon= sc.nextInt();
        switch(chon){
            case 1: 
            System.out.println("Danh sách sản phẩm thuộc Điện thoại:");
            for(int i=0; i< list.size(); i++){
                if(list.get(i).getDanhMuc().equals("Dien thoai")){
                    System.out.println(list.get(i).toString());
                }
            }
            break;
            case 2: 
            System.out.println("Danh sách sản phẩm thuộc Laptop");
            for(int i=0; i< list.size(); i++){
                if(list.get(i).getDanhMuc().equals("Laptop")){
                    System.out.println(list.get(i).toString());
                }
            }
            break;
            case 3: 
            System.out.println("Danh sách sản phẩm thuộc Apple:");
            for(int i=0; i< list.size(); i++){
                if(list.get(i).getDanhMuc().equals("Apple")){
                    System.out.println(list.get(i).toString());
                }
            }
            break;
            case 4: 
            System.out.println("Danh sách sản phẩm thuộc Phụ kiện:");
            for(int i=0; i< list.size(); i++){
                if(list.get(i).getDanhMuc().equals("Phu kien")){
                    System.out.println(list.get(i).toString());
                }
            }
            break;

            default:
            break;
            
        }
    }
}
