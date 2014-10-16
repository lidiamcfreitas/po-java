public class GreaterThan implements SelectionPredicate
{
    int _value;

    public GreaterThan(int value) 
    {
        _value = value;
    }

    @Override
    public boolean ok(int value)
    {
        return value > _value;
    }
}
