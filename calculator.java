import java.util.*;
     public class calculator{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number a:");
            double a = sc.nextDouble();

            System.out.print("Enter the number b:");
            double b = sc.nextDouble();
 
            System.out.println("Choose the operation:");
            System.out.println("1:+(Addition)");
            System.out.println("2:-(Subtraction)");
            System.out.println("3:*(multiplication)");
            System.out.println("4:/(Divison)");
            System.out.println("5:%(Modulor)");

            int choice =sc.nextInt();
            double result;

            switch (choice) {
               case 1:
                  result=a+b;
                  System.out.println("Result:" + result);
                  break;
               
               case 2:
                  result=a-b;
                  System.out.println("Result:" + result);
                  break;

               case 3:
                  result=a*b;
                  System.out.println("Result:" + result);
                  break;

               case 4:
                  result=a/b;
                  System.out.println("Result:" + result);
                  break;

               case 5:
                  result=a%b;
                  System.out.println("Result:" + result);
                  break;
            
               default:
                    System.out.println("Invalid choice");
                    break;
            }
             sc.close();   

        }
     }