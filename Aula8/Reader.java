import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Reader{
    
    public static void main(String[] args) throws IOException {
        
        try {
            
            BufferedReader in = new BufferedReader(new FileReader(args[0]));
            
            String string, file, maxString = new String();
            file = "";
            
            int sizeOfString = 0;
            
            while((string = in.readLine()) != null)
            {
                int a = string.length(); // is this more eficient?
                
                if (a > sizeOfString)
                {
                    sizeOfString = a;
                    maxString = string;
                }
                file += string + "\n";
            }
            
            System.out.format("maximum string: %s\nsize: %d\n", maxString, sizeOfString);
            System.out.println(file);
            
            in.close();
        } catch (IOException e){
            System.out.println("File doesn't exist.");
        }
    }
}