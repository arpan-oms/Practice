package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LList {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList();
        //adding elements to linked list
        l1.add(3);
        l1.add(5);
        l1.add(4);
        l1.add(2, 10);
        //removing elements from linked list
        l1.remove();
        l1.removeFirst();
        l1.removeLast();
        Iterator<Integer> iterator = l1.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //copy elements from stack to linked list
        Stack<String> stack = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();
        stack.add("Hello");
        stack.add("Everyone");
        l2.addAll(stack);
        Iterator<String> iterator1 = l2.iterator();
        while(iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
    }
}
