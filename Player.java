class Player
{
	private String Player,Span;
	private int Mat,Inns;
	Player(String p,String sp,int mat,int in)
	{
		this.Player=p;
		this.Span=sp;
		this.Mat=mat;
		this.Inns=in;
	}
	/*void setPlayer(String p)
	{
		this.Player=p;
	}
	void setSpan(String s)
	{
		this.Span=s;
	}
	void setMat(int m)
	{
		this.Mat=m;
	}
	void setInns(int i)
	{
		this.Inns=i;
	}*/
	int getInns()
	{
		return Inns;
	}
	String getPlayer()
	{
		return Player;
	}
	String getSpan()
	{
		return Span;
	}
	int getMat()
	{
		return Mat;
	}
	public String toString()
	{
		return Player+"\t"+Span+"\t"+Mat+"\t"+Inns;
	}
	
}
