package Test;

import java.util.HashMap;

public class PieceFactory {
	private HashMap PiecePool = new HashMap();
	public Apiece GetPiece(String key)
    {
        if(!PiecePool.containsKey(key))
        {
            Apiece p=new OnePiece(key);
            PiecePool.put(key,p);
            return p;
        }
        return(Apiece)PiecePool.get(key);
    }
    public int GetPieceCount ()
    {
        return PiecePool.size();
    }
}