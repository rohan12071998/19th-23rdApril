package April21st;
import java.util.Arrays;

public class SortTheSquaresOfTheNumber {
	public class SquareOfMatrix {

		public static void main(String[] args) {
			int []arr = { -4, -3, -8, -7, 5, 4, 3, 1, 0 } ;
			squareofEachElement(arr);

		}

		private static void squareofEachElement(int[] arr) {
			int len = arr.length;
			for(int i=0; i<len; i++) {
				arr[i] = arr[i] * arr[i];
			}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));

		}
	}


}
