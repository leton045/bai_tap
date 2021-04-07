import java.util.Scanner;

public class Deverloper extends Employee{

    private int time;
    Scanner sc = new Scanner(System.in);

    public Deverloper(int id, int age, int numberTelephone, long salary, String fullname, String email, int time) {
        super(id, age, numberTelephone, salary, fullname, email);
        this.time = time;
    }

    public Deverloper() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public void input(){
        super.input();

        System.out.println("Work huor : ");
        time = sc.nextInt();
    }

    @Override
    public void display(){
        super.display();
        long itSalary;

      
        itSalary =  getSalary() + (time * 300000);
        System.out.println("Salary : " + itSalary);
    }

}  

