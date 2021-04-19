import java.util.Scanner;

public class Congnhan extends Canbo {
    private int bac;

    public Congnhan(String name, int age, String gender, String address, int bac) {
        super(name, age, gender, address);
        this.bac = bac;
    }

    public Congnhan() {
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void input () {
        super.input();
        Scanner sc = new Scanner ( System.in);
        System.out.println("Bac : ");
        bac = Integer.valueOf(sc.nextLine());
        
    }

    @Override
    public String toString() {
       
        return   "Congnhan [" +super.toString() +"bac=" + bac + "]";
    }

    
    
}
