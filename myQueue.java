import java.util.*;

public class myQueue {
    public static void main(String[] args){

    //implementatin of Queue with all methods

    Queue<Integer> si = new LinkedList<>();
        si.add(1);
        si.add(2);
        si.add(3);
        si.add(4);
        si.add(5);
        si.add(6);
        si.add(7);
        si.add(8);
      
        System.out.println(si);

        si.remove();
        si.remove();
        System.out.println(si);

        System.out.println(si.size());
        System.out.println(si.peek());
        System.out.println(si.isEmpty());
        System.out.println(si.element());
        System.out.println(si.poll());
        System.out.println(si.offer(9));
        
        System.out.println(si);
   }
}
