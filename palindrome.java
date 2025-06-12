import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<sb.length()/2; i++){
            int back = sb.length()-i-1;
            sb.setCharAt(back, sb.charAt(i));

        }
        System.out.println(sb.toString());
        sc.close();
    }
}
