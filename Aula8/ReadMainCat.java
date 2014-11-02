import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class ReadMainCat {

    public static void main(String[] args) throws IOException {
        
        try{
            
        Cat cat = new Cat(9, 4.5, "Garfield");
        
        DataOutputStream _catData = new DataOutputStream(new BufferedOutputStream( new FileOutputStream("raw.dat")));
        
        _catData.writeInt(cat.getAge());
        _catData.writeDouble(cat.getWeight());
        _catData.writeUTF(cat.getName());
        
        _catData.close();
            
        } catch(IOException e) {
            System.out.println("IO Exception");
        }
        
        
    }
    
    
}
