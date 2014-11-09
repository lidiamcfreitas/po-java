public class Gestor extends Empregado{

    public Gestor(String name, int year) { super(name, year); }

    public void trabalha() { System.out.format("Gestor %s a gerir\n", getName()); }

}
