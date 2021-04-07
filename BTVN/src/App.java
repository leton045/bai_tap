import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in );
       int chosse;

      while(true){
          System.out.println("1. You are deverloper");
          System.out.println("2. Yout are employee ");
          System.out.printf(" You chosse : ");
            chosse = sc .nextInt();
        
          if( chosse <3 && chosse >0){
              break;
          }
        }

      switch(chosse){
          case 1 :
          System.out.println("Deverloper ");
          System.out.println("How many deverloper working  in the company : ");
          int n = sc.nextInt();

          Deverloper []d = new Deverloper[n] ;

          for(int i = 0; i < d.length ; i++ ){
              System.out.println("Information : ");
              d [i] = new Deverloper();
              d [i] .input();
            } System.out.println();

          for ( int i = 0 ; i < d.length ; i ++) {
              System.out.println();
              d [i] .display();
          }
          break;

          case 2 :
          System.out.println("Inspector ");
          System.out.println("How many inpector working in the company  : ");
                int a = sc.nextInt();
                Inspector [] ip = new Inspector[a];

                for ( int i =0; i < ip.length; i ++){
                    ip [i] = new Inspector();
                    ip [i] .input();
                }System.out.println();

                for ( int i = 0; i < ip.length; i++){
                    System.out.println();
                    ip[i] .display();
                }
                break;

          default:
      }
      sc.close();
       
    }
}
