package April19th;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,1};
		int start=0;
		int end=a.length-1;
		System.out.println(Arrays.toString(a));

		Quicksort(a,start,end);
		System.out.print(Arrays.toString(a));

	}

	private static void Quicksort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start>end) {
			return;
		}else {
			int PI=Partion(a,start,end);
			Quicksort(a,start,PI-1);
			Quicksort(a,PI+1,end);
		}
		
	}

	private static int Partion(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=end;
		int PI=start;
		for(int i=start;i<end;i++) {
			if(a[i]<=a[pivot]) {
				int temp=a[i];
				a[i]=a[PI];
				a[PI]=temp;
				PI++;
			}
		}
		int temp=a[PI];
		a[PI]=a[pivot];
		a[pivot]=temp;
		return PI;
	}

}