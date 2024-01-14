package tutorials;
import java.util.*;
public class snakeNladder {

	static int dice()
	{
		Random rand = new Random();
		int res = rand.nextInt(6)+1;
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int p1_posn = 0;
		int p2_posn = 0;
		
		System.out.println("--- Snakes and Ladders ---\n");
		System.out.println("Press Enter to play");
		sc.nextLine();
		
		System.out.print("Enter your name Player 1 ");
		String p1_name = sc.nextLine();
		System.out.print("Enter your name Player 2 ");
		String p2_name = sc.nextLine();
		
		//locking mechanism
		
		
		
		while(p1_posn!=100 || p2_posn!=100)
		{
			System.out.println(p1_name+"'s turn :");
			sc.nextLine();
			int inc = dice();
			System.out.println(p1_name+" rolled a "+inc);
			p1_posn+=inc;
			if(p1_posn>100)
				{
				System.out.println("Position greater than 100, move cancelled!");
				p1_posn-=inc;
				System.out.println(p1_name+" stays at "+p1_posn);
				}
			if(p1_posn==100)
			{
				System.out.println(p1_name+" Won!!");
			}
			else
				{System.out.println(p1_name+" is now at "+p1_posn);}
			
			
			
			System.out.println(p2_name+"'s turn :");
			sc.nextLine();
			int inc2=dice();
			System.out.println(p2_name+" rolled a "+inc2);
			p2_posn+=inc2;
			if(p2_posn>100)
				{
				System.out.println("Position greater than 100, move cancelled!");
				p2_posn-=inc2;
				System.out.println(p2_name+" stays at "+p2_posn);
				}
			else if(p2_posn==100)
			{
				System.out.println(p1_name+" Won!!");
			}
			else
				{System.out.println(p2_name+" is now at "+p2_posn);}
			
		}
		
	}

}
