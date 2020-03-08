package chap04.Array.twoD.index1;

// N x M (2 x 2) --> ( (2+1) x (2+1) )
// 배열의 index를 1번부터 사용하기
// (주의)
// 배열의 0번 데이터는 비워놓고 사용해야하기 때문에, 배열의 크기를 최소 1이상 크게 잡아주어야 한다.

public class Arrays {
	static int arr[][];
	public static void main(String[] args) {
		int N = 2;
		int M = 2;
		// 배열의 크기는 [2+1][2+1] 이상으로 잡는다.
		arr = new int[2+1][2+1];
		arr[1][1] = 11;
		arr[1][2] = 12;
		arr[2][1] = 11;
		arr[2][2] = 11;
		
		
		System.out.println("arr[1][1] : " + arr[1][1]);
		System.out.println();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print( col + " ");
			}
			System.out.println();
		}
	}

}
