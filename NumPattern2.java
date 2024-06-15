// 		   1
// 	  	 0 1
//     1 0 1
//   0 1 0 1
// 1 0 1 0 1
class  NumPattern2
{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i;j>0;j++)
			{
				System.out.print(" ");
			}
			System.out.print("1");
			System.out.println();
		}
	}
}