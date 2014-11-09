
public class Operario extends Empregado{
    
    public Operario(String name, int year) { super(name, year); }
    
    public void trabalha() { System.out.format("Operario %s a trabalhar\n", getName()); }
    
}
