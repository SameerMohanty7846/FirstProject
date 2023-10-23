package aaaa;

public class Demoa1 {
	static void selectionSort(int a[], int n) {
		for (int i = 0; i < n; i++) {
			int min_pos = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min_pos]) {
					min_pos = j;
				}
			}
			if (min_pos != i) {
				int temp = a[min_pos];
				a[min_pos] = a[i];
				a[i] = temp;
			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 10, 18, 5, 16, 2, 9, 12, 6, 4, 7 };
		selectionSort(a, 10);
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
