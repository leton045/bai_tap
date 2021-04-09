import java.util.Scanner;

public class ARRAYexe1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        int MAX = arr[0];
        int MIN = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > MAX){
                MAX = arr[i];
            }
            if(arr[i] < MIN){
                MIN = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất Max = " + MAX);
        System.out.println("-------------");
        System.out.println("Giá trị nhỏ nhât MIN = " + MIN);
        System.out.println("---------------");
        System.out.println("Các số nguyên tố trong mảng là : ");
        for(int i = 0; i< arr.length; i++){
            if(soNguyenTo(arr[i])){
                System.out.printf(arr[i] + ", ");
            }
        }System.out.println();
        sc.close();
    }

    public static boolean soNguyenTo(int a ){
        if(a<2){
            return false;
        }
            for(int i = 2; i<=Math.sqrt(a) ; i++){
                if(a % i ==0){
                    return false;
                }
            }return true;
        
        
     }
    
}
