import java.util.Iterator;

public class Table{
    
    private int _vector[];
    private int _size;

    public Table(int size)
    {
        _vector = new int[size];
        _size = size;
    }

    public void setAll(int value)
    {
        for(int i = 0; i<_size; i++)
            _vector[i] = value;
    }

    public void setValue(int pos, int value)
    {
        _vector[pos] = value;
    }
    
    public Iterator getIterNext()
    {
        return new IterNext();
    }

    public Iterator getIterPrev()
    {
        return new IterPrev();
    }

    public class IterNext implements Iterator<Integer>
    {
        int _index = 0;
        
        @Override
        public boolean hasNext() { return _index < Table.this._size; }
        @Override
        public Integer next() { return Table.this._vector[_index++]; }
        @Override
        public void remove() { throw new UnsupportedOperationException(); }
    
    }
    
    public class IterPrev implements Iterator
    {
        int _index = _size - 1;
        
        @Override
        public boolean hasNext() { return _index >= 0; }
        @Override
        public Integer next() { return Table.this._vector[_index--]; }
        @Override
        public void remove() { throw new UnsupportedOperationException(); }
        
    }
    
    public static void main(String[] args)
    {
    
        Table t1 = new Table(10);
        
        for(int i = 1; i<=10;i++)
            t1.setValue(i-1,i);
        
        
        Iterator iPrev = t1.getIterPrev();
        Iterator iNext = t1.getIterNext();
    
        while(iNext.hasNext())
        {
            System.out.println(iNext.next());
        }
              
        while(iPrev.hasNext())
        {
            System.out.println(iPrev.next());
        }
    }
}