import java.util.*;

public class practise {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate ignored

        System.out.println(fruits); // [Apple, Banana, Mango] (order not guaranteed)
    }
}
