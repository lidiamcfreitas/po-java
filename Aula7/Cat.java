public class Cat{
    
    private String _name = " ";
    private int _age = 0;
    
    public Cat(String name, int age) { _name = name; _age = age; }

    public String getName() { return _name; }

    public String toString() { return "CAT: " + _name + " " + _age; }

}
