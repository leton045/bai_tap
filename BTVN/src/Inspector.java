import java.util.Scanner;

public class Inspector extends Employee {
    private int  erro;

    public Inspector(int id, int age, int numberTelephone, long salary, String fullname, String email, int erro) {
        super(id, age, numberTelephone, salary, fullname, email);
        this.erro = erro;
    }

    public Inspector() {
    }

    public int getErro() {
        return erro;
    }

    public void setErro(int erro) {
        this.erro = erro;
    } 


    @Override
    public void input () { 
        super.input();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        erro = sc .nextInt();

        System.out.println();
    }

    @Override
    public void display(){
        super.display();
        long salaryInspector;
        salaryInspector = getSalary() + (erro * 300000);

        System.out.println("Salary Inspector : " + salaryInspector);

    }
}
