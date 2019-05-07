/*
 * program : this program output the reverse of an list of arrays
 */
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = {1, 5, 8, 16};
		arrayList(myList);

	}
	private static void arrayList(int[] myList) {
		for(int i = myList.length - 1; i>=0; i--) {
            System.out.println(myList[i]);
        }
		
	}
	        

}
