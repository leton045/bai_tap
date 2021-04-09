import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

// Câu 1: Viết chương trình nhập vào mảng A có n phần tử, các phần tử là những số
// nguyên lớn hơn 0 và nhỏ hơn 100 được nhập từ bàn phím. Thực hiện các công 
// việc sau:
// 1, Tìm phần tử lớn nhất và phần tử lớn thứ 2 và chỉ số của các phần tử đó
// 2, Tìm và in ra các phần tử là số nguyên tố trong mảng (Những phần tử nào không 
// là số nguyên tố thì in ra số 0)
// VD: mảng 2 7 9 5 3 1 0 4 5 2 7 8 -> 0 7 0 5 3 0 0 0 5 0 7 0
// 3, Tạo mảng B có m phần tử, các phần tử là những số nguyên lớn hơn 0 và nhỏ
// hơn 100, tìm phần giao của mảng A và mảng B
// VD: A[] = {5, 4, 8, 9, 1, 2} B[] = {7, 3 , 2, 5}
// Output: 2, 5


public class Baitapboxung1 {
    
    public static boolean SNT(int a){
        if (a<2){
            return false;
        }
            for(int i =2; i<=Math.sqrt(a); i++){
                if(a % i == 0){
                    return false;
                }
            }
        return true;
    }

    // cho dieu kien 2 mang bang nhau .
    public static void giao(int arr2[], int arr[], int n, int m){
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                if(arr[i] == arr2[j]){
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập n");
        int n = sc.nextInt();
        int [] arr = new int [n];


        // NHAP PHAN TU CHO MANG TU BAN PHIM. 
        System.out.println("Nhap cac so trong khoang 0-100");
        for(int i =0; i<arr.length; i++){
            System.out.printf ("A["+i+"]= ");
            arr [i] = sc.nextInt();
        }

        // IN RA GIA TRI LỚN NHẤT CUA MANG .
        int MAX = arr [0]; 
        int i;
        for( i = 0; i < arr.length; i++){
            if(arr[i] > MAX){
                MAX = arr[i];
            } 
        }System.out.println("Gia trị lớn nhất trong mảng là :  " + (MAX));


        // VỊ TRÍ CỦA GTLN
        System.out.println("Giá trị index của MAX là : ");
        for( i = 0; i<arr.length; i++){
            if(MAX == arr[i]){
                System.out.println(i);
            }
        }

       
       //GIÁ TRỊ LỚN THỨ 2 CỦA MANG 
       System.out.println("GT Lớn thứ 2 của mảng : ");
       int max2 = arr[0];
       for( i =0; i<arr.length; i++){
           if(arr[i] >max2 && arr[i] <MAX){
               max2 = arr[i];
           }
       }System.out.println(max2);

       // VỊ TRI cua số lớn thứ 2 : 
       System.out.println("VI tri cua GTL2 : ");
       for( i = 0; i<arr.length ; i++){
           if(max2 == arr[i]){
            System.out.println(i);
           }
       }

       //in ra so nguyen to . 
       System.out.println("so nguyen to la : ");
       for( i=0; i<arr.length; i++){
           if(SNT(arr[i])){
               System.out.print(arr[i]+ " " );
           }else{
               System.out.print(0+ " ");
           }
       }System.out.println();

       System.out.println("---------------------");
      

       // giao cua 2 mang .

       System.out.println("NHap mang thu 2 : ");
       int m = sc .nextInt();
       int arr2[] = new int [m];
       
       for( i=0; i< arr2.length; i++){
           System.out.printf("A["+i+"]= ");
           arr2[i] = sc.nextInt();
       }

       for(i = 0; i<arr2.length; i++){
        System.out.printf(arr2[i]+ ",");
       }System.out.println();

       // Giao cua 2 mang : 
       System.out.println("giao cua 2 mang la : ");
       giao(arr2, arr, n, m);
       sc.close();
    }

}