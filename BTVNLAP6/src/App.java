import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner ( System.in );
        int chon ;
        System.out.println(" --Danh muc--- : \n");
        

        while (true){
            System.out.println("1. Sach giao khoa ");
            System.out.println("2. Do an ");
            System.out.println("3. Tai lieu dien tu  ");
            System.out.println( "Ban chon .");
                chon = sc.nextInt();

            if( chon < 4 && chon > 0){
                break;
            }
        }

        switch( chon ){

            case 1 :
            System.out.println( "so luong sach giao khoa muon nhap :  ");

            int n = sc.nextInt(); 
            System.out.println();

            SachGiaoKhoa [] gk = new SachGiaoKhoa [n];

            for( int  i = 0; i < gk.length; i++ ){
                System.out.println();
                gk [i] = new SachGiaoKhoa();
                gk [i].input();
            }System.out.println();

            
            for( int i = 0; i < gk.length; i++ ) {
                System.out.println( "Thong tin: ");
                gk [i].display();
                gk[i].viTri();
                
            }
           
            break;


            case 2 :
            System.out.println( "So luong do an muon nhap : ");
             
            int a = sc .nextInt();
            System.out.println();

            DoAn [] da = new DoAn[a];

            for( int i = 0; i < da.length ; i++ ){
                System.out.println();
                da [i] = new DoAn();
                da [i] .input();
                
            }System.out.println();
            for( int i = 0; i < da.length ; i++ ) {
                
                System.out.println( "Thong tin ");
                da [i] .display();
                da [i].viTri();
                
            }
            break;


            case 3 :
            System.out.println( "So luong tai lieu dien tu muon nhap : ");
            int b = sc.nextInt();
            System.out.println();

            Tailieudientu [] dt = new Tailieudientu[b];

            for( int i =0 ; i < dt.length ; i++ ) {
                System.out.println();
                dt [i] = new Tailieudientu();
                dt [i] .input();
            }

            for( int i = 0; i < dt.length ; i ++ ){
                System.out.println("Thong tin : ");
                dt [i].display();
                
            }
            break;

            default:
        }
    }
}
