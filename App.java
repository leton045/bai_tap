import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap số lượng công nhân : ");
       int n = sc.nextInt();


       Employee [] el = new Employee[n];
       for(int i = 0; i< el.length ; i++){
        System.out.println();
            System.out.println("Nhap thong tin : ");
            el [i] = new Employee();
            el [i].input();
       }

       for(int i =0; i < el.length ; i++){
           System.out.println();
           System.out.println("Thong tin hien thi : ");
           el [i] .display();
       }
       sc.close();
    }
}
