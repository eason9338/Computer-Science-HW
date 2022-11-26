import java.util.Random;

public class SquareMatrix {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[][] a;
		int[][] b;
		int[][] c;
		
		a = new int[2][];
		b = new int[2][];
		c = new int[2][];
		
		//insert value to a and b
		for(int i = 0; i < a.length; i++) {
			a[i] = new int[2];
			b[i] = new int[2];
			c[i] = new int[2];
			for(int j = 0; j < a.length; j++) {
				a[i][j] = rd.nextInt(20) + 1;
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				b[i][j] = rd.nextInt(20) + 1;
				System.out.print(b[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//calculate a * b, assign to c
		
		//row
		for(int i = 0; i < a.length; i++) {
			//column
			for(int j = 0; j < b[0].length; j++) {
				c[i][j] = 0; //initialize
				//time of calculation
				for(int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
