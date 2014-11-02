import java.io.Serializable;

public class CatSerial implements Serializable{
    private int _age;
    private double _weight;
    private String _name;

    public CatSerial(int age, double weight, String name)
    {
        _age = age;
        _weight = weight;
        _name = name;
    }

    public int getAge() { return _age; }

    public double getWeight() { return _weight; }

    public String getName() { return _name; }
    

}
