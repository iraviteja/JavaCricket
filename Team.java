import javax.swing.*;
import java.io.*;
import java.util.*;
class Team
{
	Random ran=new Random();
	String players[]=new String[11];
	int scores[]=new int[11];
	int wicket=0;
	int ballsplayed[]=new int[11];
	String status[]=new String[11];
	String tName;
	int tScore;
	int get;
	int prevscore;
	String s="";
	Team(String name)
	{
		this.tName=name;
		this.tScore=0;
	}
	Team(String name,int g,int prev)
	{
		this.tName=name;
		this.tScore=0;
		this.get=g;
		this.prevscore=prev;
	}
	void getPlayers(String fname)throws IOException
	{
		FileReader fr=new FileReader(fname);
		BufferedReader br=new BufferedReader(fr);
		br.readLine();
		String str;
		int i=0;
		while((str=br.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(str,"\t");
			this.players[i]=st.nextToken();
			this.scores[i]=0;
			this.ballsplayed[i]=0;
			this.status[i]="NOT PLAYED";
			i++;
			
		}
		fr.close();
		br.close();
	}
	void start_Match()
	{
		int first=0,m=1,n=0,temp,next=0,runs=0,tot=0,i,ins=0;
		String p[];
		p=new String[2];
		int zero[],bf[],score[];
		score=new int[2];
		zero=new int[2];
		bf=new int[2];
		for(i=0;i<4;i++)
		{
			if(wicket==10)
				break;
			temp=m;
			m=n;
			n=temp;
			for(int j=0;j<6;j++)
			{
				if(first==0)
				{
					p[m]=players[m];
					next++;
					p[n]=players[n];
					next++;
					bf[m]=0;
					bf[n]=0;
					score[m]=0;
					score[n]=0;
					this.status[m]="NOT OUT";
					this.status[n]="NOT OUT";
					zero[m]=0;
					zero[n]=0;
					first=1;
				}
				
				s="Overs: "+i+"."+j+"\nCurrent Runs: "+runs+"\nTeam_Score: "+tScore+"/"+wicket+"\nStriking: "+p[m]+"* "+score[m]+"("+bf[m]+")"+"\nNonStriking: "+p[n]+" "+score[n]+"("+bf[n]+")";
				JOptionPane.showMessageDialog(null,s);
				runs=ran.nextInt(7);
				tot=tot+runs;
				this.tScore=tot;
				if(get==1)
				{
					System.out.println(prevscore+"  "+tScore);
					if(prevscore<tScore)
					{
						System.out.println(tScore);
						break;
					}
				}
				
				score[m]=score[m]+runs;
				bf[m]++;
				if(runs==0)
				{
					zero[m]++;
				}
				if(runs%2!=0)
				{
					temp=m;
					m=n;
					n=temp;
				}
				if(zero[m]==3)
				{
					
					this.status[wicket]="OUT";
					this.scores[wicket]=score[m];
					this.ballsplayed[wicket]=bf[m];
					wicket++;
					p[m]=players[next];
					status[next]="NOT OUT";
					bf[m]=0;
					score[m]=0;
					zero[m]=0;
					next++;
					
					
				}
				if(wicket==10)
					break;
				if(get==1)
				{
					if(prevscore<tScore)
						break;
				}
			}
			
		}
		for(i=0;i<11;i++)
		{
			if(status[i].equals("NOT OUT") )
			{
				if(ins==0)
				{
					if(m==0)
					{	
						this.scores[i]=score[m];
						this.ballsplayed[i]=bf[m];
						ins=1;
					}
					else
					{
						this.scores[i]=score[n];
						this.ballsplayed[i]=bf[n];
						ins=2;
					}
					
				}
				else
				{
					if(ins==1)
					{
						this.scores[i]=score[n];
						this.ballsplayed[i]=bf[n];
					}
					else
					{
						this.scores[i]=score[m];
						this.ballsplayed[i]=bf[m];
					}
					
				}
			}
				
			
		}
		if(get!=1)
		{
			int sc=tScore+1;
			String ss="Need "+sc+" runs to win.";
			JOptionPane.showMessageDialog(null,ss);
		}
			
	}
	void intoFile() throws IOException
	{
		String fName=tName+"innings.txt";
		FileWriter fw=new FileWriter(fName);
		fw.write("Player\tScore\tBallsfaced\tStatus\n");
		for(int i=0;i<11;i++)
		{
			String s=players[i]+"\t"+scores[i]+"\t"+ballsplayed[i]+"\t"+status[i]+"\n";
			fw.write(s);
		}
		String sco="Totalscore\t"+tScore+"\t"+"Wickets\t"+wicket+"\n";
		fw.write(sco+"\n");
		fw.close();
	}
	
}
