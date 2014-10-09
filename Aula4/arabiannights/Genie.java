package arabiannights;

public class Genie {
    private int _limit;
    private int _granted;

    public Genie(int wishes) {
        _limit = wishes;
    }

    public int getGrantedWishes(){
        return _granted;
    }
    
    public int getRemainingWishes(){
        return _limit - _granted;
    }

    public boolean canGrantWish() { return getRemainingWishes() != 0; }

    public void doGrantWish() { _granted++; }

    public boolean grantWish(){
        if (canGrantWish()){
            doGrantWish();
        }
    }

}
