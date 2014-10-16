public class Application
{
    public static void main(String[] args) {
        Table t = new Table(3);

        t.setAllValues(90);

        SelectionPredicate p1 = new GreaterThan(9);

        if (t.contains(p1))
            System.out.println("YUP");
        else
            System.out.println("NOP");

        SelectionPredicate p2 = new EqualTo(89);

        if (t.contains(p2))
            System.out.println("YUP");
        else
            System.out.println("NOP");
    }
}
