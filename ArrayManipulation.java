import java.util.*;
public class ArrayManipulation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" : Even");
            }
            else{
                System.out.println(arr[i]+" : Odd");
            }
        }

        sc.close();
    }
}
