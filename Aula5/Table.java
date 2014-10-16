public class Table 
{
    private int _vector[];

    public Table(int nInts) {
        _vector = new int[nInts];
    }

    public int getValue(int position) {
        if (position < 0 && position >= _vector.length) {
            System.out.println("out of range");
            return -1;
        } else
          return _vector[position];
    }

    public void setValue(int position, int value) {
        if (position < 0 && position >= _vector.length)
            System.out.println("out of range");
        else
            _vector[position] = value;
    }

    public void setAllValues(int value) {
        for (int position = 0; position < _vector.length; position++) 
            _vector[position] = value;
    }

    public boolean contains(SelectionPredicate predicate) {
        for (int position = 0; position < _vector.length; position++)
            if (predicate.ok(_vector[position])) return true;
        return false;
    }

}
