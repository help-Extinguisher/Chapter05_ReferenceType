package Training;

public class ArrayMinMaxExample {
		
/*
 * 	자료형이 int형, 1차원 배열을 매개변수로 전달받아서 
 * 	배열에 저장된 최대값과 최소값을 찾아서 반환하는 메소드를 
 * 	각각 다음의 형태로 구현하라.
 * 
 * 	public static int minValue(int[] arr) // int형 배열. 최소값 반환
 * 	public static int maxValue(int[] arr) // 최대값 반환
 *  
 * 
 * 
 */
		
// 	1차원 배열을 선언하고 구현된 메소드를 call해서 사용.

	
//	------------ 강사님의 모범 답안 ----------------------
	
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
		
	
	
	
	
	
	
	
	
	
	
	
//	---------------- 내가 한 망한 코딩 -------------------------
	
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
