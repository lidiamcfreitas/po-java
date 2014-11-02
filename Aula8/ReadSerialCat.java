import java.io.*;

public class ReadSerialCat{

    public static void main(String[] args) throws InvalidClassException, NotSerializableException, IOException, ClassNotFoundException, StreamCorruptedException, OptionalDataException
    {
        try{
        
            CatSerial cat = new CatSerial(1, 0.5, "Garfield");
            
            ObjectOutputStream savedCat = new ObjectOutputStream( new BufferedOutputStream(new FileOutputStream("cat.dat")));
            
            savedCat.writeObject(cat);
            
            savedCat.close();
        
        } catch (InvalidClassException e){
            System.out.println("InvalidClassException");
        } catch (NotSerializableException e){
            System.out.println("NotSerializableException");
        } catch (IOException e){
            System.out.println("IOException");
        }
        
        try {
            
            ObjectInputStream object = new ObjectInputStream( new BufferedInputStream(new FileInputStream("cat.dat")));
            
            CatSerial cat = (CatSerial) object.readObject();
            
            System.out.println(cat.getAge());
            System.out.println(cat.getWeight());
            System.out.println(cat.getName());
            
            object.close();
        } catch ( ClassNotFoundException e){
            System.out.println("ClassNotFoundException");
        } catch (StreamCorruptedException e){
            System.out.println("StreamCorruptedException");
        } catch (OptionalDataException e){
            System.out.println("OptionalDataException");
        }
    }

}