public class Numero {
    int x;
    static int a = 7;
    {
        int b = 1;
        System.out.println("non-static block: a = " + a + " b = " + b);
    }
    static {
        int b = 4;
        System.out.println("static block: a = " + a + " b = " + b);
    }
    {
        int b = 3;
        System.out.println("non-static block: a = " + a + " b = " + b + " x = " + x);
    }
}
