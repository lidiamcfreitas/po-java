package arabiannights;

public class MagicLamp{
    private int _limit;
    private int _totalRubs;
    private int _rubs;
    private int _demons;

    public MagicLamp(int limit){
        _limit = limit;
    }
    
    public int getGenies(){
        return _limit - _rubs;
    }

    public int getDemons(){
        return _demons;
    }

    public Genie rub(int wishes){
        if (_rubs <_limit){
                if (_totalRubs % 2 == 0) {
                    return new FriendlyGenie(wishes);
                } else {
                    return new GrumpyGenie(wishes);
                }
        } else {
            return new RecycableDemon(wishes);
        }
    }

    public void feedDemon(RecycableDemon: demon){
    	demon.recycle();
        _totalRubs += _rubs;
        _rubs = 0;
        _demons++;
    }
    
    
    
}
