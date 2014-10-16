public class Table
{
    private int _vector[];

    public Table(int size) {
        _vector = new int[size];
    }

    public int getValue(int position){
        return _vector[position];
    }

    public void setValue(int position, int value){
        _vector[position] = value;
    }

    public void setAllValues(int value){
        for(int position = 0; position < _vector.length; position++)  
           _vector[position] = value;
    }

    public void print(Transform t) {
        for(int position = 0; position < _vector.length; position++)
            System.out.println(t.transform(_vector[position]));
    }
}
