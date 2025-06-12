import java.util.*;

public class myStack {
    public static void main(String[] args){

    //implementation of Stack with all methods

    Stack<Integer> si = new Stack<>();
        si.push(11);
        si.push(12);
        si.push(13);
        si.push(14);
        si.push(15);
        si.push(16);
        si.push(17);
        si.push(18);

        System.out.println(si);

        si.pop();
        si.pop();
        System.out.println(si);

        System.out.println(si.peek());
        System.out.println(si.size());
        System.out.println(si.isEmpty());

    //reverse the stack
    Stack<Integer> sv = new Stack<>();
        while (si.size() > 0){
            sv.push(si.pop());
        }
        System.out.println(sv);
    }
}
