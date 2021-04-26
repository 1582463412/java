package Test;

public class OnePiece extends Apiece {

    public OnePiece(String inKind)
    {
        super(inKind);
    }
    @Override
    public void play(int x, int y) {
        //TODO Auto-generated method stub
     System.out.println("把"+inKind+"子放在("+x+","+y+")的位置");
    }
}