public class CarApp{
    
    public static void main(String[] args){
        Car c1 = new Car();
        CarMidrange c2 = new CarMidrange();
        CarTop c3 = new CarTop();
        
        c1.go();
        c2.go();
        c3.go();
        
        c1.stop();
        c2.stop();
        c3.stop();
        
        BasicEngine e = new BasicEngine();

        c2.updateEngine(e);
        c3.updateEngine(e);
        
        c2.go();
        c3.go();
        c2.stop();
        c3.stop();
        
        XTreme xtra = new XTreme(); 

        c3.addXtra(xtra);
        c3.go();
        c3.stop();
    }
    
}
