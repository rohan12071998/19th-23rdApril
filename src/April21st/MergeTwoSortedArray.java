package April21st;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int a[]= {1,3,4,5};
		int b[]= {2,4,6,8};
		int n1=a.length;
		int n2=b.length;
		int c[]= new int [n1+n2];
		Mergesort(a,b,n1,n2,c);
		
		
	}

	private static void Mergesort(int[] a, int[] b, int n1, int n2, int[] c) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		while(i<n1 && j<n2) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
			}else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<n1) {
			c[k]=a[i];
			k++;
			i++;
		}while(j<n2) {
			c[k]=b[j];
			k++;
			j++;
		}
		for(int m=0;m<(n1+n2);m++) {
			System.out.print(c[m]+" ");
		}
		
	}
}