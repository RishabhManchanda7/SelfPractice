import java.util.LinkedList;
import java.util.List;

import java.util.*;


public class Linkedlist {

    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.get(2);

        System.out.println(linkedlist.get(2));
        linkedlist.remove(2);

        System.out.println(linkedlist);
    }

}
