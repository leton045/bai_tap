import java.util.ArrayList;
import java.util.Scanner;

public class Mani {
    public static void main(String[] args) {
        
        ArrayList<Canbo> canbos = new ArrayList<>();

        ArrayList <Congnhan> congnhans = new ArrayList<>();
        ArrayList <Kysu> kysus = new ArrayList<>();
        ArrayList <Nhanvien> nhanviens  = new ArrayList<>();
        int chon ;
        Scanner sc = new Scanner (System.in);

        do {
            showmenu();
            chon = sc.nextInt();
            switch (chon){
                case 1:
                System.out.println("1. Chon nhap thong tin cong nhan : ");
                System.out.println("2. Chon nhap thong tin ki su ");
                System.out.println("3. Chon nhap thong tin nhan vien  ");
                    int chon1 = sc.nextInt();
                    switch (chon1){
                        case 1 : 
                        
                        System.out.println("So cong nhan can nhap : ");
                        int n = sc.nextInt();
                        for (int i=0; i < n; i++){
                            Congnhan cn = new Congnhan();
                           cn.input();
                           congnhans.add(cn);
                        }
                        break;

                        case 2 : 
                        
                        System.out.println("So ky su can nhap : ");
                        int a = sc.nextInt();
                        for (int i=0; i < a; i++){
                            Kysu ks = new Kysu();
                           ks.input();
                           kysus.add(ks);
                        }
                        break;

                        case 3 : 
                        
                        System.out.println("So Nhan vien  can nhap : ");
                        int b = sc.nextInt();
                        for (int i=0; i < b; i++){
                            Nhanvien nv = new Nhanvien();
                           nv.input();
                           nhanviens.add(nv);
                        }
                        break;

                        default:
                        break;
                    }

                break;

                case 2:
                sc.nextLine();
               
                System.out.println("Nhap ten can tim kiem : ");
                String ten = sc.nextLine();
                // Canbo cb = new Canbo();
                // for(int i = 0; i < canbos.size(); i++){
                //     cb.input();
                //     canbos.add(cb);
            // }
            Canbo cb = new Canbo();
               
                    cb.input();
                    canbos.add(cb);
                
                
                for (int i = 0; i < canbos.size(); i ++){
                    
                    if(canbos.get(i).getName().equals(ten)){
                        System.out.println(canbos.get(i).toString());
                    }
                }
                break;


                case 3:
                System.out.println("1. Chon  thong tin cong nhan : ");
                System.out.println("2. Chon  thong tin ki su ");
                System.out.println("3. Chon  thong tin nhan vien  ");
                int chon2 = sc.nextInt();
                switch (chon2) {
                    case 1 : 
                    
                    System.out.println("thong tin cong nhan la : ");
                    for(int i =0; i < congnhans.size(); i ++){
                        Congnhan congnhan = congnhans.get(i);
                        System.out.println(congnhan.toString());
                    }
                    break;

                    case 2 : 
                    System.out.println("thong tin ki su  la : ");
                    for(int i =0; i < kysus.size(); i ++){
                       
                        System.out.println(kysus.get(i).toString());
                    }
                    
                    break;

                    case 3 :
                    System.out.println("thong tin Nhan vien  la : ");
                    for(int i =0; i < nhanviens.size(); i ++){
                        Nhanvien nhanvien = nhanviens.get(i);
                        System.out.println(nhanvien.toString());
                    }
                    break;
                    

                    default:
                    break;
                }

                break;

                case 4 :
                System.exit(4);
                break;

                default:
                break;
            }
           
            

        }while (chon != 4);
        


    }

    static void showmenu () {
        System.out.println("1. Them can bo ");
        System.out.println("2. Tim kiem theo ho ten : ");
        System.out.println("3. Hien thi thong tin danh sach can bo : ");
        System.out.println("4. Thoat ");
    }
    
}
