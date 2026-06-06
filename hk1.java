 import java.util.Scanner;

public class hk1{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int first = arr[0];
        int total = 0;

        for(int i = 1;i<arr.length;i++){
            total +=  first +arr[i];

        }
        System.out.println(total);
         

        
        

        scan.close();
    }
}
