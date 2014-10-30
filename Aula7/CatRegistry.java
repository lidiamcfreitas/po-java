import java.util.Map;
import java.util.TreeMap;

public class CatRegistry {

    private Map<String, Cat> _registry = new TreeMap<String, Cat>();

    public Cat get(String name) throws NoSuchCat{
        if(_registry.get(name)==null)
            throw new NoSuchCat();
        return _registry.get(name);
    }
    
    public void put(Cat cat) throws ExistingCat
    {
        try{
            get(cat.getName());
        } catch(NoSuchCat exception){
            _registry.put(cat.getName(), cat);
        } finally
        {
            if (_registry.get(cat.getName())==null)
                throw new ExistingCat();
        }
    }



    public static void main(String[] args) throws NoSuchCat, ExistingCat{
    
        CatRegistry registry = new CatRegistry();
        Cat c1 = new Cat("Pantufa", 9);
        Cat c2 = new Cat("Tareco", 1);
        
        registry.put(c1);
        registry.put(c2);
        registry.put(c1);
        registry.get("Pantufa");
        
        System.out.println(c1);
        System.out.println(c2);
    }
}
