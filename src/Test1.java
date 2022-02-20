import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee("Anton", 22), "first");
        map.put(new Employee("Anton", 21), "second");
        map.put(new Employee("Anton", 23), "third");

        System.out.println(map.size());
    }
}
