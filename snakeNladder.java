package tutorials;
import java.util.*;
public class snakeNladder {

	static int dice()
	{
		Random rand = new Random();
		int res = rand.nextInt(6)+1;
		return res;
	}
	
	static int stair_snakes(int pos)
	{
		switch(pos) 
		{
		case 1:
			pos=38;
			System.out.println("Climbed a ladder !");
			break;
		case 4:
			pos=14;
			System.out.println("Climbed a ladder !");
			break;
		case 8:
			pos=30;
			System.out.println("Climbed a ladder !");
			break;
		case 21:
			pos=42;
			System.out.println("Climbed a ladder !");
			break;
		case 28:
			pos=74;
			System.out.println("Climbed a ladder !");
			break;
		case 50:
			pos=67;
			System.out.println("Climbed a ladder !");
			break;
		case 71:
			pos=92;
			System.out.println("Climbed a ladder !");
			break;
		case 80:
			pos=99;
			System.out.println("Climbed a ladder !");
			break;
			
			
		case 32:
			pos=10;
			System.out.println("Got bit by a Snake !");
			break;
		case 36:
			pos=6;
			System.out.println("Got bit by a Snake !");
			break;
		case 62:
			pos=18;
			System.out.println("Got bit by a Snake !");
			break;
		case 48:
			pos=26;
			System.out.println("Got bit by a Snake !");
			break;
		case 88:
			pos=24;
			System.out.println("Got bit by a Snake !");
			break;
		case 95:
			pos=56;
			System.out.println("Got bit by a Snake !");
			break;
		case 97:
			pos=7;
			System.out.println("Got bit by a Snake !");
			break;
		default:
			pos=pos;
		}
		return pos;
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
			p1_posn=stair_snakes(p1_posn);
			
			if(p1_posn>100)
				{
				System.out.println("Position greater than 100, move cancelled!");
				p1_posn-=inc;
				System.out.println(p1_name+" stays at "+p1_posn);
				}
			else if(p1_posn==100)
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
			p1_posn=stair_snakes(p1_posn);
			
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
