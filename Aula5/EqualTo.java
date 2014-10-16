public class EqualTo implements SelectionPredicate
{
    private int _value;

    public EqualTo(int value)
    {
        _value = value;
    }

    @Override
    public boolean ok(int value)
    {
        return _value == value;
    }
}
