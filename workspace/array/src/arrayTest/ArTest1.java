package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {2,4,5,6,8};
		
		System.out.println(arData);
		System.out.println(arData.length);
		System.out.println("====================");
		
		for(int i=0; i<arData.length; i++) {
			System.out.println(arData[i]);
			
		}
		System.out.println("====================");
//		5,4,3,2,1�� �� �濡 �ְ� ���
		
		for(int i = 0; i< arData.length; i++) {
			arData[i] = 5 - i;
			
		}
		for (int i=0; i<arData.length; i++) {
			System.out.println(arData[i]);
		}
		
	}
}
