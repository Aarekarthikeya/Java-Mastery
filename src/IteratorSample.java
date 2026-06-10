import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grapes");
        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            String s=it.next();
            if(s.equals("grapes"))
            {
                it.remove();
            }


        }
        System.out.println(list);
ArrayList<String> fruits= new ArrayList<>();
fruits.add("Banana");
fruits.add("Grapes");
fruits.add("avacado");
ListIterator<String> itr=fruits.listIterator(fruits.size());
while(itr.hasPrevious())
{
    String s=itr.previous();
    if(s.equals("Grapes"))
    {
        itr.set("papaya");
    }
}
        System.out.println(fruits);

    }
}
