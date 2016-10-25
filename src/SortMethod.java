import java.util.Arrays;


public class SortMethod {

	public SortMethod() {
		
	}
	
	public void bubbleSort(int[] list){
		for(int k=1; k<list.length; k++){
			for(int i=0; i< list.length - k;i++){
				if(list[i] > list[i+1]){
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(list));
	}
	
	public void selectionSort(int[] list){
		for(int i = 0; i<list.length - 1;i++){
			int min = list[i];
			int minIndex = i;
			for(int k = i+1; k<list.length;k++){
				if(list[k] < min){
					min = list[k];
					minIndex = k;
				}
			}
			if(min != list[i] && minIndex != i){
				list[i] = list[minIndex];
				list[minIndex] = min;
			}
		}
		System.out.println(Arrays.toString(list));
	}
	
	public void insertSort(int[] list){
		for(int i=1; i<list.length;i++){
			int current = list[i];
			int k;
			for(k = i-1; k>=0 && current < list[k]; k--){
				list[k+1] = list[k];
			}
			list[k+1] = current;
		}
		System.out.println(Arrays.toString(list));
	}
	
	public void mergeSort(int[] list){
		if(list.length>1){
			int[] firstHalf = new int[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length /2);
			mergeSort(firstHalf);
			
			int secondHalfLength = list.length - list.length/2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			
			int[] temp = merge(firstHalf,secondHalf);
			System.arraycopy(temp, 0, list, 0, temp.length);
			
		}	 
	}
	
	private int[] merge(int[] list1, int[] list2){
		int[] temp = new int[list1.length + list2.length];
		
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		
		while(current1 < list1.length && current2 < list2.length){
			temp[current3++] = (list1[current1] < list2[current2]) ? list1[current1++] : list2[current2++];
		}
		
		while(current1 < list1.length){
			temp[current3++] = list1[current1++];
		}
		
		while(current2 < list2.length){
			temp[current3++] = list2[current2++];
		}
		
		return temp;
		
	}
}
