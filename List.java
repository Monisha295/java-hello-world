import java.util.*;



public class List {
    public static void main(String[] args){
    LinkedList<Integer>list1=new LinkedList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(5);
    Linkedlist<Integer>list2=new LinkedList<>();
    list2.add(6);
    list2.add(7);
    list2.add(8);
    list2.add(9);
    list1.addAll(list2);
    Collections.sort(list1);
    System.out.println(list1);
    
}
}


