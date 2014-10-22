import java.util.Iterator;

public class TableIterator implements Iterable
{

    private int _vector[];
    private int _size;
    
    public TableIterator(int size){
    	_size = size;
        _vector = new int[size];
    }

    public Iterator<Integer> iterator(){
        class TableIter implements Iterator<Integer> {
            int _index = 0;
            @Override
            public boolean hasNext() { return _index < TableIterator.this._size; }
            @Override
            public Integer next() { return TableIterator.this._vector[_index++]; }
            @Override
            public void remove() { throw new UnsupportedOperationException(); }

        }

        return new TableIter();
    }

    public void setValue(int pos, int value){
    	_vector[pos] = value;
    }

    public static void main(String[] args)
    {
        TableIterator t1 = new TableIterator(5);

        for(int i=0;i<5;i++)
            t1.setValue(i,i);
        
        for(int i: t1)
            System.out.println(i);
        

    }

}
