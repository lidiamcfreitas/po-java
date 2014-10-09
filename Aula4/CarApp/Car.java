public class Car {
    
    private Engine _engine;
    
    public Car() {
        _engine = new Engine();
    }
    
    public void go() {
        _engine.on();
    }
    
    public void stop() {
        _engine.off();
    }
    
    public Engine getEngine() {
        return _engine;
    }
    
    public void setEngine(Engine engine) {
        _engine = engine;
    }
    
}