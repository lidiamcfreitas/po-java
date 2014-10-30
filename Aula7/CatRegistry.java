import java.util.Map;
import java.util.TreeMap;

public class CatRegistry {

    private Map<String, Cat> _registry = new TreeMap<String, Cat>();
    
    public class ExistingCat extends Exception{}
    public class NoSuchCat extends Exception{}

    public Cat get(String name) throws NoSuchCat{
        if(_registry.get(name)==null)
            throw new NoSuchCat();
        return _registry.get(name);
    }
    
    public void put(Cat cat) throws ExistingCat
    {
        boolean sucess = false;
        try{
            get(cat.getName());
        } catch(NoSuchCat exception){
            sucess = true;
            
        }
        if (sucess)
            _registry.put(cat.getName(), cat);
        else
            throw new ExistingCat();

    }



    public static void main(String[] args) throws NoSuchCat, ExistingCat{
    
        CatRegistry registry = new CatRegistry();
        Cat c1 = new Cat("Pantufa", 9);
        Cat c2 = new Cat("Tareco", 1);
        
        registry.put(c1);
        registry.put(c2);
        try{
            registry.put(c1);}
        catch(ExistingCat e){
            System.out.println("Pantufa already exists");
        }
        
        registry.get("Pantufa");
        
        try{
            registry.get("Garfield");}
        catch(NoSuchCat e){
            System.out.println("Garfield doesn't exist");
        }
        
        
        System.out.println(c1);
        System.out.println(c2);
    }
}
