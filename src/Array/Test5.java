package Array;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String players[][]= new String[3][2];

		players[0][0]="Rohit ";
		players[0][1]="Ishan ";
		players[1][0]="Virat ";
		players[1][1]="Surya ";
		players[2][0]="Sheyash";
		players[2][1]="Tilak ";
		//rows-->3-->0,1,2
		//columns-->2-->0,1

		for(int i=0;i<=2;i++)//outer for loop-->rows
		{
		for(int j=0;j<=1;j++)// inner for loop-->columns
		{
		System.out.print(players[i][j]+" ");
		}
		System.out.println();
		}
	}

}
