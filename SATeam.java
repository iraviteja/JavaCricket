import java.io.*;
import java.util.*;
class SATeam
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr=new FileReader("Team_SA_T20.txt");
		BufferedReader br=new BufferedReader(fr);
		int num=Integer.parseInt(br.readLine());
		Batsman bat[]=new Batsman[num];
		int indx=0,i,tmp,j;
		double temp;
		String str;
		
		FileWriter fw=new FileWriter("sa.txt");
		fw.write(br.readLine());
		double arr[]=new double[num];
		int ln[]=new int[num];
		for(i=0;i<num;i++)
		{
			ln[i]=i;
		}
		while((str=br.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(str,"\t");
			String p=st.nextToken();
			String sp=st.nextToken();
			int mat=Integer.parseInt(st.nextToken());
			int in=Integer.parseInt(st.nextToken());
			int n=Integer.parseInt(st.nextToken());
			int r=Integer.parseInt(st.nextToken());
			int h=Integer.parseInt(st.nextToken());
			double a=Double.parseDouble(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			double s=Double.parseDouble(st.nextToken());
			arr[indx]=s;
			int hn=Integer.parseInt(st.nextToken());
			int f=Integer.parseInt(st.nextToken());
			int z=Integer.parseInt(st.nextToken());
			int fo=Integer.parseInt(st.nextToken());
			int x=Integer.parseInt(st.nextToken());
			bat[indx]=new Batsman(p,sp,mat,in,n,r,h,a,b,s,hn,f,z,fo,x);
			indx++;
			
		}
		for(i=0;i<num;i++)
		{
			for(j=i;j<num;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					tmp=ln[j];
					ln[j]=ln[i];
					ln[i]=tmp;
				}
			}
			if(i<11)
			{
				fw.write('\n');
				fw.write(bat[ln[i]].toString());
			}
		}
		/*FileReader frb=new FileReader("T20_Bowlers_data.txt");
		BufferedReader brb=new BufferedReader(frb);
		int numb=Integer.parseInt(brb.readLine());
		Bowler bowl[]=new Bowler[num];
		int indxb=0,ib,tmpb,jb;
		double tempb;
		String strb;
		FileWriter fwb=new FileWriter("Team_Bowl.txt");
		fwb.write(brb.readLine());
		double arrb[]=new double[numb];
		int lnb[]=new int[numb];
		for(ib=0;ib<numb;ib++)
		{
			lnb[ib]=ib;
		}
		while((strb=brb.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(strb,"\t");
			String p=st.nextToken();
			String sp=st.nextToken();
			int mat=Integer.parseInt(st.nextToken());
			int in=Integer.parseInt(st.nextToken());
			double o=Double.parseDouble(st.nextToken());
			double m=Double.parseDouble(st.nextToken());
			int r=Integer.parseInt(st.nextToken());
			int w=Integer.parseInt(st.nextToken());
			double a=Double.parseDouble(st.nextToken());
			double e=Double.parseDouble(st.nextToken());
			arrb[indxb]=e;
			bowl[indxb]=new Bowler(p,sp,mat,in,o,m,r,w,a,e);
			indxb++;
			
		}
		for(ib=0;ib<numb;ib++)
		{
			for(jb=ib;jb<numb;jb++)
			{
				if(arrb[jb]<arrb[ib])
				{
					tempb=arrb[jb];
					arrb[jb]=arrb[ib];
					arrb[ib]=tempb;
					tmpb=lnb[jb];
					lnb[jb]=lnb[ib];
					lnb[ib]=tmpb;
				}
			}
			if(ib<5)
			{
				fwb.write('\n');
				fwb.write(bowl[lnb[ib]].toString());
			}
		}*/
		fr.close();
		fw.close();
		br.close();
		/*frb.close();
		fwb.close();
		brb.close();*/
	}
}
