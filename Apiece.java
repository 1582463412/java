package Test;

public abstract class Apiece 
{
	protected String inKind;
	public Apiece(String inKind)
	{
		this.inKind = inKind;
		}
	//����ʱ���ӵ�λ��
	public abstract void play (int x,int y);
	}
