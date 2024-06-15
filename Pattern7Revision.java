//     *
//    * *
//   * * *
//  * * * *
// * * * * *

class Pattern7Revision
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
		{
			//loop for space
			for(int j=1;j<=((i+j)/2);j++)
			{
				System.out.print(" ");
			}

			//loop for stars
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}


// for(int i=1;i<=6;i++)
// 		{
// 			//loop for spaces
// 			for(int j=5;j>=i;j--)
// 			{
// 				System.out.print(" ");
// 			}
// 			//loop for stars
// 			for(int j=1;j<=i-1;j++)
// 			{
// 				System.out.print("* ");
// 			}
			
// 			System.out.println();
// 		}
// 		