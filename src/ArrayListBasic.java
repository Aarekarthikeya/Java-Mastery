import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");

        System.out.println("List: " + list);

        System.out.println("Get index 1: " + list.get(1));

        list.set(1, "Spring Boot");

        System.out.println("After set(): " + list);

        System.out.println("Contains Java: " + list.contains("Java"));

        System.out.println("Index of Hibernate: " + list.indexOf("Hibernate"));

        list.remove("Java");

        System.out.println("After remove(): " + list);

        System.out.println("Size: " + list.size());
    }
}
