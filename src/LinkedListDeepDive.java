import java.util.LinkedList;

public class LinkedListDeepDive {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");

        System.out.println("Initial List: " + list);

        // addFirst()
        list.addFirst("Python");
        System.out.println("After addFirst(): " + list);

        // addLast()
        list.addLast("Docker");
        System.out.println("After addLast(): " + list);

        // getFirst()
        System.out.println("getFirst(): " + list.getFirst());

        // getLast()
        System.out.println("getLast(): " + list.getLast());

        // get(index)
        System.out.println("get(2): " + list.get(2));

        // set(index, value)
        list.set(2, "Spring Boot");
        System.out.println("After set(): " + list);

        // contains()
        System.out.println("Contains Docker: "
                + list.contains("Docker"));

        // indexOf()
        System.out.println("Index of Docker: "
                + list.indexOf("Docker"));

        // removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): "
                + list);

        // removeLast()
        list.removeLast();
        System.out.println("After removeLast(): "
                + list);

        // remove(object)
        list.remove("Spring Boot");
        System.out.println("After remove(object): "
                + list);

        // add(index, element)
        list.add(1, "Microservices");
        System.out.println("After add(index): "
                + list);

        // size()
        System.out.println("Size: " + list.size());

        // Traversal using for-each
        System.out.println("\nTraversal:");

        for (String s : list) {
            System.out.println(s);
        }
    }
}