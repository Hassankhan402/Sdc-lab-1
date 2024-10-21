import java.util.ArrayList;
import java.util.List;

public class JoinLists {
    public static void main(String[] args) {
        // Initialize list1 with elements
        List<String> list1 = new ArrayList<>(List.of("a", "c", "d"));
        
        // Initialize list2 with elements
        List<String> list2 = new ArrayList<>(List.of("b", "e"));
        
        // Create a new list to hold the joined results
        List<String> joined = new ArrayList<>(list1);
        joined.addAll(list2);

        // Print the contents of each list
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joined);
    }
}
