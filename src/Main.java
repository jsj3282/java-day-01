import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int h, w, n, l, d, x, y, k, o;
			h = sc.nextInt();
			w = sc.nextInt();
			int[][] a = new int[h][w];
			n = sc.nextInt();
			for(int i=0; i<n; i++) {
				l = sc.nextInt();
				d = sc.nextInt();
				x = sc.nextInt();
				y = sc.nextInt();
				if(d==0) {
					for(int j=0; i<l; i++) {
						k = x-1;
						a[k][y-1] = 1;
						k++;
					}	
				}else if(d==1) {
					for(int j=0; i<l; j++) {
						o = y-1;
						a[x-1][o] = 1;
						o++;
					}
				}
			}
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
	}

}
