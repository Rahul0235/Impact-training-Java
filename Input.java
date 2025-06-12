import java.util.*;

public class Input {
    public static void main(String []args){
       Scanner Scanner = new Scanner(System.in); 
       System.out.println("Enter the number:");
       int a = Scanner.nextInt();
       int b = Scanner.nextInt();
       int sum = a+b;
       
       System.out.println(sum);
       Scanner.close();
    }
}
