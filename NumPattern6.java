// 		   1
// 	  	 0 1
//     1 0 1
//   0 1 0 1
// 1 0 1 0 1

class NumPattern6
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