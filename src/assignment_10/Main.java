//Generics, Arrays and Containers
//
//        Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.
//
//        Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList, in contrast,
//        is a doubly linked list, which means it maintains links in both directions).
//
//        Create your own SListIterator which, again for simplicity, does not implement ListIterator.
//        The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.
//
//        The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList

package assignment_10;

public class Main {
    public static void main(String[] args){

        SList<String> list=new SList<>();
        SListIterator<String> it=new SListIterator<>(list);
        it.add("Hello");
        System.out.println(list);
        it.add("Pj");
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.add("java");
        it.add("Bye");
        it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());

    }
}
