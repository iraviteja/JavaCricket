class Batsman extends Player
{
	private int NO,Runs,HS,BFD,Hun,Fif,Z,Fou,Six;
	private double Ave,SR;
	Batsman(String p,String sp,int mat,int in,int n,int r,int h,double a,int b,double s,int hn,int f,int z,int fo,int x)
	{
		super(p,sp,mat,in);
		this.NO=n;
		this.Runs=r;
		this.HS=h;
		this.Ave=a;
		this.BFD=b;
		this.SR=s;
		this.Hun=hn;
		this.Fif=f;
		this.Z=z;
		this.Fou=fo;
		this.Six=x;
	}
	int getNO()
	{
		return NO;
	}
	int getRuns()
	{
		return Runs;
	}
	int getHS()
	{
		return HS;
	}
	int getBFD()
	{
		return BFD;
	}
	int getHun()
	{
		return Hun;
	}
	int getFif()
	{
		return Fif;
	}
	int getZ()
	{
		return Z;
	}
	int getFou()
	{
		return Fou;
	}
	int getSix()
	{
		return Six;
	}
	double getAve()
	{
		return Ave;
	}
	double getSR()
	{
		return SR;
	}
	public String toString()
	{
		String s=super.toString();
		return s+"\t"+NO+"\t"+Runs+"\t"+HS+"\t"+Ave+"\t"+BFD+"\t"+SR+"\t"+Hun+"\t"+Fif+"\t"+Z+"\t"+Fou+"\t"+Six;
	}
	
}
