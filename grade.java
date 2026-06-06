import java.util.Scanner;
public class grade {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int Grade = scan.nextInt();
        if(Grade>=90){
            System.out.println("Grade A ");

        }
    else if (Grade>=70 && Grade<90){
        System.out.println("Grade B ");

    }
    else if (Grade>=50 && Grade<70){
        System.out.println("Grade c ");
        
    }
     else if (Grade>=35&& Grade<50){
        System.out.println("Grade D ");
        
    }
    else{
        System.out.println("Fail "); 

    }
       
        scan.close();

    }
}
