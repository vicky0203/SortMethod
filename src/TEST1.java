import java.util.Arrays;


public class TEST1 {
	
	int testStatic = 123;
 
	public static void main(String[] args) {
//		TEST1 test1 = new TEST1();
//    	test1.gramTest();
    	
//    	FindGcd findGcd = new FindGcd();
//    	System.out.println(findGcd.findGcdMethodSimple(2225,125));
//    	System.out.println(findGcd.findGcdByRecursion(2225,125));
		
//		FindPrime findPrime = new FindPrime();
//		findPrime.findPrime(1000);
		
		SortMethod sortMethod = new SortMethod();
		int[] list = {2, 8, 9, 0, 13, 1, 17, 4};
		//sortMethod.bubbleSort(list);
		//sortMethod.selectionSort(list);
		//sortMethod.insertSort(list);
		sortMethod.mergeSort(list);
		System.out.println(Arrays.toString(list));
	} 
	
	public void gramTest(){
		simpleTest();
    	int[] searchArray = {3,6,7,9,22};
    	System.out.println(binarySearch(searchArray, 22));
    	System.out.println(binarySearch(searchArray, 23));
    	double[] list1 = {1,9,4.5,6.6,5.7,-4.5};
    	selectionSort(list1);
    	System.out.println(Arrays.toString(list1));
    	System.out.println(testStatic);
	}
	
	
	public void simpleTest(){
		// TODO Auto-generated method stub
		int i=0;
    	int j=1;
    	for(i=0;i<5;i++,System.out.println(i)){
    		if(i==3){
    			j=0;
    			continue;
    		}
    		if(j==0){
    			break;
    		}
    	}
    	
    	String a = "asdfdsf";
    	String[] b = a.split("");
    	String[] c = {"sdf", "sdf", "dwe"};
    	System.out.println(Arrays.toString(c));
    	
    	String[] str = {"abc", "bcd", "def"};
    	StringBuffer sb = new StringBuffer();
    	for(int ii = 0; ii < str.length; ii++){
    	  sb.append(str[ii]);
    	}
    	String ss = sb.toString();
    	System.out.println((char)('a' + Math.random()*('z'-'a' + 1)));
    	
    	char[] city = {'D', 'K', 'Z'};
    	System.out.println(city);
	}
	
	public int binarySearch(int[] list, int key){
		int low = 0;
		int height = list.length - 1;
		
		while(height >= low){
			int mid = (low + height) / 2;
			if(key > list[mid]){
				low = mid + 1;
			}else if(key == list[mid]){
				return mid;
			}else{
				height = mid - 1;
			}
		}
		
		return -low-1;
	}
	
	public void selectionSort(double[] list){
		for(int i=0; i<list.length-1; i++){
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for(int j=i+1; j<list.length; j++){
				if(currentMin > list[j]){
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i){
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public void insertSort(double[] list){
		for(int i=1; i<list.length;i++){
			double currentElement = list[i];
			int k;
			
			for(k= i-1; k>=0 && list[k]> currentElement; k--){
				list[k + 1] = list[k];
			}
			
			list[k+1] = currentElement;
		}
	}

}
