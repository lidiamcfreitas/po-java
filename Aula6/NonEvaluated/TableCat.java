import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Table implements Comparable<Table>
{
    private int _size;
    private List<Cat> _vector = new ArrayList<Cat>();

    public final static Comparator<Cat> MAX_COMPARATOR = new maxComparator();
    public final static Comparator<Cat> LENGTH_COMPARATOR = new lengthComparator();
    public Table(int size) { _size = size; _vector = new int[_size];}
    
    public int getValue(int position){
        if (position < 0 && position > _size) throw new IllegalArgumentException("Must be between 0 and size");
        return _vector[position]; 
    }

    public void setValue(int position, int value) throws IllegalArgumentException{
        if (position < 0 && position > _size)
            throw new IllegalArgumentException("Must be between 0 and size");
        _vector[position] = value;
    }

    public void setAll(int value) {
    	for(int i=0;i<_size;i++)
            _vector[i] = value;
    }

    public int getSum(){
        int sum = 0;

        for(int i : _vector){
            sum += i;
        }
        return sum;
    }

    public int max(){
        int j = _vector[0];
        for (int i: _vector)
            if ( i >= j) { i = j; j = i;}
        return j;
    }

    public int getSize() { return _size; }

    public int compareTo(Table table) throws NullPointerException{
        if (table == null) throw new NullPointerException();
        return getSum()- table.getSum();
    }

    private static class maxComparator implements Comparator<Table> {
        public int compare(Table t1, Table t2) {
            return t1.max() - t2.max();
        }
    }

    private static class lengthComparator implements Comparator<Table> {
        public int compare(Table t1, Table t2) {
            return t1.getSize() - t2.getSize();
        }
    }
    public static void main(String[] args)
    {
        Table t1 = new Table(10);
        Table t2 = new Table(11);

        t1.setAll(10);
        t2.setAll(11);

        System.out.println(t1.compareTo(t2));
        System.out.println(t2.compareTo(t1));
        System.out.println(t2.compareTo(t2));
        System.out.println(Table.MAX_COMPARATOR.compare(t1, t2));
        System.out.println(Table.MAX_COMPARATOR.compare(t2, t1));
        System.out.println(Table.MAX_COMPARATOR.compare(t1, t1));
        System.out.println(Table.LENGTH_COMPARATOR.compare(t1, t2));
        System.out.println(Table.LENGTH_COMPARATOR.compare(t2, t1));
        System.out.println(Table.LENGTH_COMPARATOR.compare(t1, t1));
    }
}
