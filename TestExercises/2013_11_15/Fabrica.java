import java.util.List;
import java.util.ArrayList;

public class Fabrica{

    private List<Empregado> _empregados = new ArrayList<Empregado>();

    public void fabrica(){
        for(Empregado e: _empregados){
            e.trabalha();
        }
    }

    public void putEmpregado(Empregado e){
        _empregados.add(e);
    }

    public static void main(String[] args){
    
    Fabrica fabrica = new Fabrica();

    Gestor _lidia = new Gestor("lidia", 1994);
    Gestor _leal = new Gestor("Boss leal", 1993);
    Operario _joao = new Operario("joao", 1993);

    fabrica.putEmpregado(_lidia);
    fabrica.putEmpregado(_joao);
    fabrica.putEmpregado(_leal);

    fabrica.fabrica();

    }

}
