public class CarTop extends CarMidrange {
    
    private XTreme _xtra;
    
    @Override
    public void go() {
        super.go();
        if (_xtra != null) _xtra.on();
    }
    
    @Override
    public void stop() {
        super.stop();
        if (_xtra != null) _xtra.off();
    }
    
    public void addXtra(XTreme engine) {
        _xtra = engine;
    }
    
}
