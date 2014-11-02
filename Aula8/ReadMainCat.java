import java.io.*;

public class ReadMainCat {

    public static void main(String[] args) throws IOException , EOFException,  UTFDataFormatException {
        
        try{
            
            Cat cat = new Cat(9, 4.5, "Garfield");
            
            DataOutputStream _catDataOutput = new DataOutputStream(new BufferedOutputStream( new FileOutputStream("raw.dat")));
            
            _catDataOutput.writeInt(cat.getAge());
            _catDataOutput.writeDouble(cat.getWeight());
            _catDataOutput.writeUTF(cat.getName());
            
            _catDataOutput.close();
            
        }
        catch(EOFException e) {
            System.out.println("EOFException");
        }
        catch(UTFDataFormatException e) {
            System.out.println("UTFDataFormatException");
        }
        catch(IOException e) {
            System.out.println("IOException");
        }
        
        try {
        
            DataInputStream _catDataInput = new DataInputStream(new BufferedInputStream(new FileInputStream("raw.dat")));
            
            System.out.println(_catDataInput.readInt());
            System.out.println(_catDataInput.readDouble());
            System.out.println(_catDataInput.readUTF());
            
            _catDataInput.close();
            
        }
        catch(EOFException e) {
            System.out.println("EOFException");
        }
        catch(UTFDataFormatException e) {
            System.out.println("UTFDataFormatException");
        }
        catch(IOException e) {
            System.out.println("IOException");
        }
    
    }
}
