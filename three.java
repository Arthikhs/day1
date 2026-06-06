import java.util.Scanner;
public class three {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
         int num2 = scan.nextInt();
          int num3 = scan.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("Grade A "+num1);

        }
        else if (num3>num1&&num3>num2){
             System.out.println("Grade c "+num3);
        }
        
        else{
            System.out.println("no one is greatest");
        }

        
       
        scan.close();
    }
    }

