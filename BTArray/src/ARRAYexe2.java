import java.util.Scanner;

public class ARRAYexe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng n = ");
        int n = sc.nextInt();
        System.out.println("Nhập số cột m = ");
        int m = sc.nextInt();
        int [][] arr1 = new int [n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.printf("A["+i+"]["+j+"] = ");
                arr1[i][j] = sc.nextInt();
                
            }
        }
        System.out.println("Ma trận sau khi nhập là  : ");
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.printf( arr1[i][j] + "\t");
            }System.out.println("");
        }

        System.out.println("Số phần tử của đường  chéo chính là : ");
        int sumArr = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){

                // Điều kiện để tạo thành đường chéo chính 
                if(i==j){
                    System.out.printf(arr1[i][j] + "\t");
                    sumArr  +=arr1[i][j];
                }
            }
        }System.out.println("\nTổng các đường chéo chính  = " + sumArr);

        
        sc.close();
    }
    
}
