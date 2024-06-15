	// 	1
	// 	2 4
	// 	3 5 7
	// 	4 6 8 10
	// 	5 7 9 11 13
class NumPattern7
{
	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num+=2;
			}
			System.out.println();
			num = num-(2*i)+1;
		}
	}
}