package p1;

public class array {

	public static void main(String[] args) {
		int arr2[][] = 
			{
					{45,58,95},
					{101,102,103},
					{77,88,99},
					{177,188,199},
					
			};
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				int x = arr2[i][j];
				System.out.print(x+" ");
			}
			System.out.print("\n");

	}
		for(int[] x: arr2)
		{
			for (int j: x)
				System.out.println(j);
			System.out.println("\n");
		}
		}

}
