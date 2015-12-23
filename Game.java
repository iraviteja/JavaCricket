import java.util.*;
import java.io.*;
import javax.swing.*;
class Game
{
	public static void main(String args[]) throws IOException
	{
		Random ran=new Random();
		
		
		System.out.println("---------TOSS TIME--------------");
		Scanner scan=new Scanner(System.in);
		System.out.println("Select your toss for Team INDIA. Enter 1 or 0.");
		int toss=scan.nextInt();
		int t=ran.nextInt(2);
		if(toss==t)
		{
			System.out.println("India won the toss and elected to bat first.");
			Team India=new Team("INDIA");
			India.getPlayers("ind.txt");
			India.start_Match();
			India.intoFile();
			FileReader frb=new FileReader("INDIAinnings.txt");
			BufferedReader brb=new BufferedReader(frb);
			String strb="";
			for(int i=1;i<=13;i++)
				strb=brb.readLine();
			StringTokenizer stb=new StringTokenizer(strb,"\t");
			stb.nextToken();
			int ind=Integer.parseInt(stb.nextToken());
			Team SA=new Team("SouthAfrica",1,ind);
			SA.getPlayers("sa.txt");
			SA.start_Match();
			SA.intoFile();
			FileReader fr=new FileReader("SouthAfricainnings.txt");
			BufferedReader br=new BufferedReader(fr);
			String str="";
			for(int i=1;i<=13;i++)
				str=br.readLine();
			StringTokenizer st=new StringTokenizer(str,"\t");
			st.nextToken();
			int sa=Integer.parseInt(st.nextToken());
			if(ind>sa)
			{
				System.out.println("INDIA WON THE MATCH");
				JOptionPane.showMessageDialog(null,"INDIA WON THE MATCH");
			}
			else if(sa>ind)
			{
				System.out.println("SA WON THE MATCH");
				JOptionPane.showMessageDialog(null,"SA WON THE MATCH");

			}
			else
			{
				System.out.println("MATCH DRAWN");
				JOptionPane.showMessageDialog(null,"MATCH DRAWN");

			}
			fr.close();
			br.close();
			frb.close();
			brb.close();
			
		}
		else
		{
			System.out.println("SouthAfrica won the toss and elected to bat first.");
			Team SA=new Team("SouthAfrica");
			SA.getPlayers("sa.txt");
			SA.start_Match();
			SA.intoFile();
			FileReader fr=new FileReader("SouthAfricainnings.txt");
			BufferedReader br=new BufferedReader(fr);
			String str="";
			for(int i=1;i<=13;i++)
				str=br.readLine();
			StringTokenizer st=new StringTokenizer(str,"\t");
			st.nextToken();
			int sa=Integer.parseInt(st.nextToken());
			Team India=new Team("INDIA",1,sa);
			India.getPlayers("ind.txt");
			India.start_Match();
			India.intoFile();
			FileReader frb=new FileReader("INDIAinnings.txt");
			BufferedReader brb=new BufferedReader(frb);
			String strb="";
			for(int i=1;i<=13;i++)
				strb=brb.readLine();
			StringTokenizer stb=new StringTokenizer(strb,"\t");
			stb.nextToken();
			int ind=Integer.parseInt(stb.nextToken());
			if(ind>sa)
			{
				System.out.println("INDIA WON THE MATCH");
				JOptionPane.showMessageDialog(null,"INDIA WON THE MATCH");
			}
			else if(sa>ind)
			{
				System.out.println("SA WON THE MATCH");
				JOptionPane.showMessageDialog(null,"SA WON THE MATCH");

			}
			else
			{
				System.out.println("MATCH DRAWN");
				JOptionPane.showMessageDialog(null,"MATCH DRAWN");

			}
			fr.close();
			br.close();
			frb.close();
			brb.close();
		}
		
		
		
		
	}
}
