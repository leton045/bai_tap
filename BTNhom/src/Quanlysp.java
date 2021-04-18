import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Quanlysp {
    ArrayList<Sanpham> listSP = new ArrayList<>();
    Scanner sc= new Scanner(System.in);

    public ArrayList<Sanpham> themSP (){
        System.out.println("Nhập số lượng sản phẩm:");
        int n= Integer.valueOf(sc.nextLine());
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
        int chon= Integer.valueOf(sc.nextLine());
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

    public void layTheoHang(ArrayList<Sanpham> sanphams){
       System.out.println("Nhap hang can tim kiem : ");
       String nhap = sc.nextLine();
       for(int i = 0; i < sanphams.size(); i ++ ){
           if(sanphams.get(i).getHang().equals(nhap)){
               System.out.println(sanphams.get(i).toString() + "\n");
           }
       }
    }

    public void inThongTinGiaVaDanhMuc (ArrayList<Sanpham> listSP){
        
        System.out.println("Chon san pham : ");
        System.out.println("1. Điện thoai : ");
        System.out.println("2. Laptop : ");
        System.out.println("3. Apple : ");
        System.out.println("4. Phụ kiện : ");
        int chon ;    // chọn 1 trong số các danh mục 
        chon = Integer.valueOf(sc.nextLine());

        switch (chon ){
            case 1 :
            System.out.println("Chon so tien ban co : ");
             System.out.println("1. 2-4 trieu ");
             System.out.println("2. 4-7 trieu ");
             System.out.println("3. 7-13 trieu");
            System.out.println("4. tren 13 trieu ");
            int chon1 ;
            chon1 = sc.nextInt();
            switch (chon1){
                case 1 :
                for ( int i = 0; i < listSP.size(); i ++){
                    if(listSP.get(i).getDanhMuc().equals("Dien thoai") && listSP.get(i).getGiaBan()
                     >= 2000000 && listSP.get(i).getGiaBan()< 4000000){
                        System.out.println(listSP.get(i).toString());
                    }
                }
                break;
                case 2 :
                for ( int i = 0; i < listSP.size(); i ++){
                    if(listSP.get(i).getDanhMuc().equals("Dien thoai") && listSP.get(i).getGiaBan()
                     >= 4000000 && listSP.get(i).getGiaBan()< 7000000){
                        System.out.println(listSP.get(i).toString());
                    }
                }
                break;
                case 3 : 
                for ( int i = 0; i < listSP.size(); i ++){
                    if(listSP.get(i).getDanhMuc().equals("Dien thoai") && listSP.get(i).getGiaBan()
                     >= 7000000 && listSP.get(i).getGiaBan()< 13000000){
                        System.out.println(listSP.get(i).toString());
                    }
                }
                break;

                case 4 : 
                for ( int i = 0; i < listSP.size(); i ++){
                    if(listSP.get(i).getDanhMuc().equals("Dien thoai") && listSP.get(i).getGiaBan()
                     >=13000000){
                        System.out.println(listSP.get(i).toString());
                    }
                }
                break;

                default :
                break;

            }

            break;
           

            case 2 :
            System.out.println("Chon so tien ban co : ");
            System.out.println("1. 2-4 trieu ");
            System.out.println("2. 4-7 trieu ");
            System.out.println("3. 7-13 trieu");
           System.out.println("4. tren 13 trieu ");
           
           chon1 = sc.nextInt();
           switch (chon1){
               case 1 :
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Laptop") && listSP.get(i).getGiaBan()
                    >= 2000000 && listSP.get(i).getGiaBan()< 4000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;
               case 2 :
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Laptop") && listSP.get(i).getGiaBan()
                    >= 4000000 && listSP.get(i).getGiaBan()< 7000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;
               case 3 : 
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Laptop") && listSP.get(i).getGiaBan()
                    >= 7000000 && listSP.get(i).getGiaBan()< 13000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;

               case 4 : 
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Laptop") && listSP.get(i).getGiaBan()
                    >=13000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;

               default :
               break;
            }
            break;

            case 3 : 
            System.out.println("Chon so tien ban co : ");
            System.out.println("1. 2-4 trieu ");
            System.out.println("2. 4-7 trieu ");
            System.out.println("3. 7-13 trieu");
           System.out.println("4. tren 13 trieu ");
            
           chon1 = sc.nextInt();
           switch (chon1){
               case 1 :
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Apple") && listSP.get(i).getGiaBan()
                    >= 2000000 && listSP.get(i).getGiaBan()< 4000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;
               case 2 :
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Apple") && listSP.get(i).getGiaBan()
                    >= 4000000 && listSP.get(i).getGiaBan()< 7000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;
               case 3 : 
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Apple") && listSP.get(i).getGiaBan()
                    >= 7000000 && listSP.get(i).getGiaBan()< 13000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;

               case 4 : 
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Apple") && listSP.get(i).getGiaBan()
                    >=13000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;

               default :
               break;

            }

            break;

            case 4 :
            System.out.println("Chon so tien ban co : ");
            System.out.println("1. 2-4 trieu ");
            System.out.println("2. 4-7 trieu ");
            System.out.println("3. 7-13 trieu");
           System.out.println("4. tren 13 trieu ");
            
           chon1 = sc.nextInt();
           switch (chon1){
               case 1 :
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Phu kien") && listSP.get(i).getGiaBan()
                    >= 2000000 && listSP.get(i).getGiaBan()< 4000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;
               case 2 :
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Phu kien") && listSP.get(i).getGiaBan()
                    >= 4000000 && listSP.get(i).getGiaBan()< 7000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;
               case 3 : 
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Phu kien") && listSP.get(i).getGiaBan()
                    >= 7000000 && listSP.get(i).getGiaBan()< 13000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;

               case 4 : 
               for ( int i = 0; i < listSP.size(); i ++){
                   if(listSP.get(i).getDanhMuc().equals("Phu kien") && listSP.get(i).getGiaBan()
                    >=13000000){
                       System.out.println(listSP.get(i).toString());
                   }
               }
               break;

               default :
               break;
            }
            break;

            
           

            

           

                default:
                break;
                

        }


        


    }
}
//  for( int i = 0; i < listSP.size() ; i++){
//                 if(listSP.get(i).getHang().equals("Dienthoai")){
//                     System.out.println("Chon so tien ban co : ");
//                     System.out.println("1. 2-4 trieu ");
//                     System.out.println("2. 4-7 trieu ");
//                     System.out.println("3. 7-13 trieu");
//                     System.out.println("4. tren 13 trieu ");
//                     int chon1 ;
//                     chon1 = Integer.valueOf(sc.nextLine());
//                     switch (chon1) {
//                         case 1 :
//                             for(  i =0; i < listSP.size(); i++){
//                                 if( listSP.get(i).getGiaBan() >=2000000 && listSP.get(i).getGiaBan() <4000000){
//                                     System.out.println(listSP.get(i).toString());
//                             }
//                         }
//                         break;
        
//                         case 2 :
//                         for(  i =0; i < listSP.size(); i++){
//                             if( listSP.get(i).getGiaBan() >=4000000 && listSP.get(i).getGiaBan() <= 7000000){
//                                 System.out.println(listSP.get(i).toString());
//                             }
//                         }
//                         break;
        
        
//                         case 3 :
//                         for(  i =0; i < listSP.size(); i++){
//                             if( listSP.get(i).getGiaBan() >=7000000 && listSP.get(i).getGiaBan() <=13000000){
//                                 System.out.println(listSP.get(i).toString());
//                             }
//                         }
//                         break;
        
//                         case 4 :
//                         for(  i =0; i < listSP.size(); i++){
//                             if( listSP.get(i).getGiaBan() >13000000){
//                                 System.out.println(listSP.get(i).toString());
//                             }
//                         }
//                         break;
        
//                         default:
//                         break;
        
//                         }
//                     System.out.println(listSP.get(i).toString());
//                 }
//             }
           

           
//                 break;


//             case 2 :

//             for( int i = 0; i < listSP.size(); i ++){
//                 if(listSP.get(i).getHang().equals("Laptop")){
//                     System.out.println(listSP.get(i).toString());
//                 }
//             }

//             System.out.println("1. 2-4 trieu ");
//             System.out.println("2. 4-7 trieu ");
//             System.out.println("3. 7-13 trieu");
//             System.out.println("4. tren 13 trieu ");
            
//              int chon1 = Integer.valueOf(sc.nextLine());

//                 switch (chon1){
//                     case 1 :
//                     for( int i =0; i < listSP.size(); i++){
//                          if( listSP.get(i).getGiaBan() >=2000000 && listSP.get(i).getGiaBan() <4000000){
//                             System.out.println(listSP.get(i).toString());
//                         }
//                      }
//                     break;

//                 case 2 :
//                     for( int i =0; i < listSP.size(); i++){
//                     if( listSP.get(i).getGiaBan() >=4000000 && listSP.get(i).getGiaBan() <= 7000000){
//                         System.out.println(listSP.get(i).toString());
//                     }
//                     }
//                     break;


//                 case 3 :
//                      for( int i =0; i < listSP.size(); i++){
//                         if( listSP.get(i).getGiaBan() >=7000000 && listSP.get(i).getGiaBan() <=13000000){
//                         System.out.println(listSP.get(i).toString());
//                     }
//                 }
//                 break;

//                 case 4 :
//                     for( int i =0; i < listSP.size(); i++){
//                     if( listSP.get(i).getGiaBan() >13000000){
//                         System.out.println(listSP.get(i).toString());
//                     }
//                     }
//                     break;

//                      default:
//                      break;


//                 }

               

//                 break;

//                 case 3:
