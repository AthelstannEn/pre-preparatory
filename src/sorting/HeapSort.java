package sorting;

import java.util.Arrays;

public class HeapSort {

	public static void heapSort(final int[] data){
		for(int i = 0; i < data.length; ++i)
			bubbleUp(data, i);
		
		for(int u  = data.length -1 ; u> 0; --u){
			swap(data, 0 , u);
		bubleDown(data, u);
		}
	}
	
	public static void main(final String... args){
		final int length = 30;
		final int[] data = TestSorting.randomeData(length);
		System.out.println(Arrays.toString(data));
		heapSort(data);
		System.out.println(Arrays.toString(data));
		System.out.println(TestSorting.isSorted(data));
	}
	
	private static void bubleDown(final int[] data, final int length){
		
		int parent = 0;
		int left = 2 * parent + 1;
		int right = 2 * parent + 2;
		int child = right < length && data[right]> data[left] ? right : left;
		while(child < length && data[parent] < data[child]){
			swap(data, parent, child);
			
			parent = child;
			left = 2 * parent + 1;
			right = 2 * parent + 2;
			child = right < length && data[right] > data[left] ? right : left;
			
		}	
	}	
		
		private static void bubbleUp(final int[] data, final int bottom){
			int child = bottom;
			int parent = (child -1 )/2;
			while(data[parent] < data[child]){
				swap(data, parent, child);
				child = parent;
				parent = (child - 1)/2;
			}
			
		}
		private static void swap(final int[] data, final int parent, final int child) {
			final int temp = data[parent];
			data[parent] = data[child];
			data[child] = temp;
		}
		
	}

