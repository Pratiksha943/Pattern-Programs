// * * * * *
//   * * * *
//     * * *
//       * *
//         *

class Pattern2Revision
{
	public static void main(String[] args) 
	{
		//outerloop
		for(int i=1;i<=5;i++)
		{
			// loop for spaces
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			//loop for stars
			//for(int j=5;j>=i;j--)
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}