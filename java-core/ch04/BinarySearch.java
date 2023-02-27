
public class BinarySearch {

	public static void main(String[] args) {
		int [] array ={1,2,3,4,5,6,7,8,9};
		int index =binarySearch(3,array,0,array.length);
		System.out.println(index+1);
	}

	private static int binarySearch(int i, int[] array, int low, int high) {
		if(low>high)return -1;
		int midd=(low+high)/2;
		if(i==array[midd])return midd;
		if(i>array[midd]) return binarySearch(i,array,midd,high);
		if(i<array[midd]) return binarySearch(i,array,low,midd);
		//Sreturn 0;
		
		return -1;
	}
	

}
