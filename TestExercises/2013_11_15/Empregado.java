public abstract class Empregado{
    
    private String _name;
    private int _year;

    public Empregado(String name, int year) { _name = name; _year = year; }

    public abstract void trabalha();
    
    public String getName() { return _name; }

}
