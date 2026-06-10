import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
//        Collection<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(5);
//        System.out.println(list.isEmpty());
//
//
//        System.out.println(list);
        ArrayList<String> list =
                new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> it =
                list.iterator();

        while(it.hasNext())
        {
            String s = it.next();

            if(s.equals("B"))
            {
                list.remove(s);
            }
        }
    }
}
