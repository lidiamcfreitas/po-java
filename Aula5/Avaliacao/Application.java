public class Application
{
    public static void main(String[] args)
    {
        Table t = new Table(3);
        for (int i = 0;i<3;i++)
            t.setValue(i, i);
        Transform p1 = new Sucessor();
        
        t.print(p1);
        
        Transform p2 = new Square();
        
        t.print(p2);
    }
}