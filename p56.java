import java.util.*;

public class p56 {

    static void addobj(int n, LinkedList l) {
        l.add(n);
        System.out.println("object added in list: " + l);
    }

    static void removeobj(int ind, LinkedList l) {
        l.remove(ind);
        System.out.println("object removed list :" + l);

    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        addobj(1, l);
        addobj(2, l);
        addobj(3, l);
        addobj(4, l);

        removeobj(0, l);
        removeobj(2, l);

    }

}