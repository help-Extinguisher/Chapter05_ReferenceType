package ch05_array;

public class ArratCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		/* 사이즈가 작아서 배열을 추가하고 싶은 경우
		 * 더 큰 배열을 만들어서 원 내용을 복사한다.
		 */
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		oldIntArray = newIntArray;
//		이렇게 해서 이름도 바꿔줄수있음
		
	}

}
