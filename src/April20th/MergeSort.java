package April20th;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int a[]= {3,4,1,6,8};
		int start=0;
		int end=a.length-1;
		System.out.println(Arrays.toString(a));
		Mergesort(a,start,end);
		System.out.print(Arrays.toString(a));
	}

	private static void Mergesort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int mid=(end+start)/2;
			Mergesort(a,start,mid);
			Mergesort(a,mid+1,end);
			
			Merge(a,start,end,mid);
		}
	}

	private static void Merge(int[] a, int start, int end, int mid) {
		// TODO Auto-generated method stub
		int i=start;
		int j=mid+1;
		int k=0;
		int temp[]=new int [end-start+1];
		while(i<=mid && j<=end) {
			if(a[i]<=a[j]) {
				temp[k]=a[i];
				k++;
				i++;
				
			}
			else  {
				temp[k]=a[j];
				k++;
				j++;
			}
		}
		while(i<=mid) {
			temp[k]=a[i];
			k++;
			i++;
		}
		while(j<=end) {
			temp[k]=a[j];
			k++;
			j++;
		}

		for(int m=start;m<=end;m++) {
			a[m]=temp[m-start];
		}
		
	}

}
