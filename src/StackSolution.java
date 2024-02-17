import java.util.Iterator;
import java.util.Stack;

public class StackSolution {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(10);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println("Peek - " + stack.peek());

        System.out.println("Is empty() - " + stack.empty());

        System.out.println("search 6 - " + stack.search(6));
        System.out.println("search 3 - " + stack.search(3)); //Search happens from top index

        //iterate over stack
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println("Size of stack:" + stack.size());

        stack.sort(null);
        System.out.println("Stack sorted:" + stack);
    }
}
