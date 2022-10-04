package Arrays;

public class TwoDimentionalArrayMatrix {

	public static void main(String[] args) {
		int[][] a1 = {{1,1,1}, {2,2,2}, {3,3,3}};
		int[][] a2 = {{1,1,1}, {2,2,2}, {3,3,3}};

		int[][] c = new int[a1.length][a2.length];
		twoDimensionalMultiply(a1, a2, c);
		System.out.println();
		twoDimensionalAdd(a1, a2, c);
	}

	public static void twoDimensionalMultiply(int[][]a1, int[][]a2, int[][] c) {
		//int[][] c = new int[a1.length][a2.length];
		for(int i=0; i<a1.length; i++) {
			for(int j=0; j<a1.length; j++) {
				c[i][j] = 0;
				for(int k=0; k<a1.length; k++) {
					c[i][j]+=a1[i][k]*a2[k][i];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void twoDimensionalAdd(int[][]a1, int[][]a2, int[][] c) {
		int i, j;
		for(i=0; i<a1.length; i++) {
			for(j=0; j<a1.length; j++) {
				c[i][j]=a1[i][j]+a2[i][j];
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}