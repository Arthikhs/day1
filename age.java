import java.util.Scanner;

public class age {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age>=18){
            System.out.println("teen");
        }
        else{
             System.out.println("adult");
        }
        scan.close();
    }
    
}
