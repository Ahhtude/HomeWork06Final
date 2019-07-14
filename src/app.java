import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class app {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.stream().forEach(System.out::println);
    }
}
