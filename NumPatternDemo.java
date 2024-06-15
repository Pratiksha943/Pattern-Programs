/*
1
3 2
6 5 4
10 9 8 7
15 14 13 12 11
 */
class NumPatternDemo
{
	public static void main(String[] args) 
	{
		int count=1;
		int num=1;
		//			1<=5 2<=5 3<=5 4<=5 5<=6 6<=5(false loop terminates) 
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count-- +" "); //1		//3 2	//6 5 4		//10 9 8 7		//15 14 13 12 11
				++num;							//2		//3 4	//5 6 7		//8 9 10 11		//12 13 14 15
			}
			count=num+i;						// count=2+1=3 			//4+2=6		//7+3=10	//11+4=15	//15+5=19
			System.out.println();
		}
	}
}