package Training;

public class ArrayMinMaxExample {
		
/*
 * 	�ڷ����� int��, 1���� �迭�� �Ű������� ���޹޾Ƽ� 
 * 	�迭�� ����� �ִ밪�� �ּҰ��� ã�Ƽ� ��ȯ�ϴ� �޼ҵ带 
 * 	���� ������ ���·� �����϶�.
 * 
 * 	public static int minValue(int[] arr) // int�� �迭. �ּҰ� ��ȯ
 * 	public static int maxValue(int[] arr) // �ִ밪 ��ȯ
 *  
 * 
 * 
 */
		
// 	1���� �迭�� �����ϰ� ������ �޼ҵ带 call�ؼ� ���.

	
//	------------ ������� ��� ��� ----------------------
	
	public static void main(String[] args) {
		
		int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 };
		
		System.out.println("min : " + minValue(arr));
		System.out.println("max : " + maxValue(arr));
		
	}
	
	
	public static int minValue(int[] ar) {
		int minNum = ar[0]; 
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<minNum) {
				minNum = ar[i];
		
			}
			
			}
		return minNum;

	
	
	}

	public static int maxValue(int[] ar) {
		int maxNum = ar[0]; 
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>maxNum) {
				maxNum = ar[i];
//				break;
			}
		}
			
		return maxNum;
		
	
	
	
	
	
	
	
	
	
	
	
//	---------------- ���� �� ���� �ڵ� -------------------------
	
//	public static void main(String[] args) {
//		
//		int min = 0;
//		int max = 0;
//		
////		int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 };
//		int[] arr = new int[7];
//		arr [0] = new int[];
//		
//		System.out.println("min : " + min);
//		System.out.println("max : " + max);
//		
//		
//		
////	public static int minValue(int[] arr) {
////		int[0] arr = arr[0]
////		
////		
////	}
////	
////	public static int maxValue(int[] arr) {
////		
////	}
	
	
		
		
	}

}
