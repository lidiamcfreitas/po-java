import java.util.Map;
import java.util.TreeMap;

public class CatRegistry{

    private Map<String, Cat> _registry = new TreeMap<String, Cat>();

    public Cat get(String name) { return _registry.get(name); }
    public void put(Cat cat) { _registry.put(cat.getName(), cat); }

    public static void main(String[] args) {
    
        CatRegistry registry = new CatRegistry();
        Cat c1 = new Cat("Pantufa", 9);
        Cat c2 = new Cat("Tareco", 1);
        
        registry.put(c1);
        registry.put(c2);

        System.out.println(c1);
        System.out.println(c2);
    }
}
